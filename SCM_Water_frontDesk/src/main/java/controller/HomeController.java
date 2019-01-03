package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mapper.CommodityMapper;
import pojo.Commodity;

@Controller
public class HomeController {
	@Autowired
	private CommodityMapper commodityMapper;
	
	@RequestMapping("home")
	public String home(Model model) {
		List<Commodity> list= 	commodityMapper.selCommodity();
		model.addAttribute("commodityList",list);
		return "lm/index";
	}
	
	@RequestMapping("details")
	public String details(Model model) {
		return "lm/product-details.html";
	}
	
	
	
	
}
