package controller;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Redirect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Commodity;
import pojo.Repertory;
import service.RepertoryService;

@Controller
public class RepertoryController {
	@Autowired
	private RepertoryService repertoryService;

	@RequestMapping("/repertoryParticulars")
	public String repertory(@RequestParam(value = "commodityName", defaultValue = "") String commodityName,
			Model model) {
		List<Repertory> repertory = repertoryService.repertory(commodityName);
		model.addAttribute("repertorylist", repertory);
		return "repertory";
	}

	@RequestMapping("/repertoryDetails")
	public String repertoryDetails(@RequestParam(value = "repertoryid", required = false) int repertoryid,
			Model model) {
		Repertory repertoryDetails = repertoryService.repertoryDetails(repertoryid);
		model.addAttribute("repertoryDetails", repertoryDetails);
		return "create";

	}

	@RequestMapping("/repertorys")
	public String repertory(@RequestParam(value = "repertoryid", required = false) int repertoryid, Model model) {
		Repertory repertoryDetails = repertoryService.repertorys(repertoryid);
		model.addAttribute("repertoryDetails", repertoryDetails);
		return "creates";

	}

	@ResponseBody
	@RequestMapping("/repertoryUpdate")
	public int repertoryUpdate(@RequestParam(value = "repertoryid", required = false) int repertoryid,
			@RequestParam("repertorystate") String repertorystate, Model model) {
		int repertoryDetails = repertoryService.repertoryUpdate(repertoryid, repertorystate);
		model.addAttribute("repertoryDetails", repertoryDetails);
		return repertoryDetails;
	}

@RequestMapping("/repertoryDel")
public String repertoryDel(@RequestParam("repertoryid")int repertoryid) {
	int repertoryDel=repertoryService.repertoryDel(repertoryid);
	return "redirect:repertoryParticulars";
	
}
@RequestMapping("/repertoryInsert")
public String repertoryInserts() {
	
	return "repertoryInsert";
	
}
@ResponseBody
@RequestMapping("/repertoryInserts")
public int repertoryInsert(Repertory repertory) {
	int repertoryInsert=repertoryService.repertoryInsert(repertory);
	return repertoryInsert;
	
}
@ResponseBody
@RequestMapping("/repertoryStock")
public int repertoryStock(@RequestParam(value = "commodityid", required = false) int commodityid,
		@RequestParam("repertoryamount") int repertoryamount, Model model) {
	int repertoryStock = repertoryService.repertoryStock(commodityid, repertoryamount);
	model.addAttribute("repertoryStock", repertoryStock);
	return repertoryStock;
}
@ResponseBody
@RequestMapping("/repertoryss")
public int repertoryss(@RequestParam("commodityId")int commodityId) {
	Integer repertoryss = repertoryService.repertoryss(commodityId);
	return repertoryss;
}
}
