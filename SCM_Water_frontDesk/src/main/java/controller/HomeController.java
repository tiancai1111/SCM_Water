package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String details(@RequestParam("id") int id, Model model) {
		Commodity commodity=commodityMapper.selById(id);
		model.addAttribute("commodity", commodity);
		return "lm/product-details.html";
	}
	
	
	
	
}
