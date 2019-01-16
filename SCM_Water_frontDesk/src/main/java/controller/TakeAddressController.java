package controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import pojo.TakeAddress;
import service.TakeAddressService;

@Controller
public class TakeAddressController {
	@Resource
	private TakeAddressService takeAddressService;
	@GetMapping("goAddress")
    public String goAddress(Model model,HttpServletRequest request) {
		int userid=(int)request.getSession().getAttribute("userid") ;
		List<TakeAddress> takeAddressList=takeAddressService.select(userid);
		model.addAttribute("takeAddressList",takeAddressList);
		return "address";
    }
	@GetMapping("goUpdateAddress")
	public String goUpdateAddress(TakeAddress takeAddress,Model model) {
		TakeAddress address=takeAddressService.findByTakeAddress(takeAddress.getTaId());
		model.addAttribute("address",address);
		model.addAttribute("status","2");
		return "AddAddress";
    }
	@GetMapping("goAddAddress")
	public String goAddAddress(Model model) {
		model.addAttribute("status","1");
		return "AddAddress";
	}
	@ResponseBody()
	@PostMapping("addAddress")
	public String addAddress(TakeAddress takeAddress,HttpServletRequest request) {
		int userId=(int)request.getSession().getAttribute("userid") ;
		takeAddress.setUserId(userId);
		int num=takeAddressService.add(takeAddress);
		String json=JSON.toJSONString(num);
		return json;
	}
	@ResponseBody()
	@PostMapping("updateAddress")
	public String updateAddress(TakeAddress takeAddress,HttpServletRequest request) {
		int userId=(int)request.getSession().getAttribute("userid") ;
		takeAddress.setUserId(userId);
		int num=takeAddressService.update(takeAddress);
		String json=JSON.toJSONString(num);
		return json;
	}
}
