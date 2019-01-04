package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Commodity;
import service.CommodityService;

@Controller
public class commodityController {
@Autowired
private CommodityService commodityService;

@RequestMapping("/commodity")
public String commodity(@RequestParam("commodityName")String commodityName,Model model) {
	List<Commodity> commodity=commodityService.commoditySelect(commodityName);
	model.addAttribute("commodity", commodity);
	return "repertory";
	
}
}
