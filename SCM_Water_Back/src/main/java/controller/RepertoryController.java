package controller;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Redirect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Repertory;
import service.RepertoryService;

@Controller
public class RepertoryController {
@Autowired
private RepertoryService repertoryService;
@RequestMapping("/repertoryParticulars")
public String repertory(@RequestParam(value="commodityName",defaultValue="")String commodityName,Model model){
	List<Repertory> repertory=repertoryService.repertory(commodityName);
	model.addAttribute("repertorylist", repertory);
	return "repertory";
}

@RequestMapping("/repertoryDetails")
public String repertoryDetails(@RequestParam(value="repertoryid",required=false)int repertoryid,Model model) {
	Repertory repertoryDetails=repertoryService.repertoryDetails(repertoryid);
	model.addAttribute("repertoryDetails", repertoryDetails);
	return "create";
	
}
@RequestMapping("/repertorys")
public String repertory(@RequestParam(value="repertoryid",required=false)int repertoryid,Model model) {
	Repertory repertoryDetails=repertoryService.repertorys(repertoryid);
	model.addAttribute("repertoryDetails", repertoryDetails);
	return "creates";
}

@RequestMapping("/repertoryUpdate")
public String repertoryUpdate(@RequestParam(value="repertoryid",required=false)int repertoryid,Model model) {
	int repertoryDetails=repertoryService.repertoryUpdate(repertoryid);
	model.addAttribute("repertoryDetails", repertoryDetails);
	return "redirect:jjj";
}

@RequestMapping("/repertoryDel")
public String repertoryDel(@RequestParam("repertoryid")int repertoryid) {
	int repertoryDel=repertoryService.repertoryDel(repertoryid);
	return "redirect:jjj";	
}
}
