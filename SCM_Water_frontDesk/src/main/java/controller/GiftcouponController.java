package controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import pojo.Giftcoupon;
import pojo.User;
import service.GiftcouponSerice;
import service.UserService;


@Controller
public class GiftcouponController {
	@Resource
	private GiftcouponSerice giftcouponSerice;
	@Resource
	private UserService userService;
	@GetMapping("gointegral_mall")
   public String findGiftcouponList(Model model,HttpServletRequest request) {
		List<Giftcoupon> giftcouponList=giftcouponSerice.findGiftcouponList();
		int id=(int)request.getSession().getAttribute("userid") ;
		User user=userService.selectUser(id);
		model.addAttribute("user",user);
		model.addAttribute("giftcouponList",giftcouponList);
	return "integral_mall";	    
   }
	@ResponseBody
	@PostMapping("addUser_Giftcoupon")
	   public String addUser_Giftcoupon(Model model,@RequestParam(name="gcId")Integer gcId,HttpServletRequest request) {
		int id=(int)request.getSession().getAttribute("userid") ;
		int num=giftcouponSerice.addUser_Giftcoupon(gcId,id);
		String json=JSON.toJSONString(num);
		System.out.println("用户id="+id);
		System.out.println(gcId);
		System.out.println(num);	
		return json;	    
	   }
	
}
