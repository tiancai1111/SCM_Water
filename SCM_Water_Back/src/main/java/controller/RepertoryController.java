package controller;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Redirect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import pojo.Commodity;
import pojo.Repertory;
import service.RepertoryService;
import util.Exportexcel;

@Controller
public class RepertoryController {
	@Autowired
	private RepertoryService repertoryService;
	@ResponseBody
	@RequestMapping("/export")
	public int export() {
		String title="仓库信息表";
		String [] headers= {"商品Id","商品名","商品进价","商品销售价","商品成本价","商品说明","商品销量","库存数量","库存充裕状态"};
		List<Repertory> dataset=repertoryService.list();
		String fileName="D:/daochu.xls";
		int result=Exportexcel.Excel(title, headers, dataset, fileName);
		return result;
		
	}

	@RequestMapping("/repertoryParticulars")
	public String repertory(@RequestParam(value = "commodityName", defaultValue = "") String commodityName,@RequestParam(value="num",defaultValue="1")int num,
			Model model) {
		int pagesize=3;
	    PageHelper.startPage(num, pagesize);
		List<Repertory> repertory = repertoryService.repertory(commodityName);
		PageInfo<Repertory> commodityPageInfo = new PageInfo<Repertory>(repertory); 
		model.addAttribute("commodityPageInfo", commodityPageInfo);
	
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
