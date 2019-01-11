package controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.jasper.tagplugins.jstl.core.Redirect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import pojo.Commodity;
import service.CommodityService;

@Controller
public class commodityController {
@Autowired
private CommodityService commodityService;
@RequestMapping("echartsTest")
public String commoditys() {
	return "echartsTest";
}
@ResponseBody
@RequestMapping("/commodity")
public List<Commodity> commodity(Model model) {
	List<Commodity> commodity=commodityService.commodity();
	return commodity;
	
}

@RequestMapping("/commoditys")
public String commoditys(Model model) {
	List<Commodity> commoditys=commodityService.commodity();
	model.addAttribute("commodityslist", commoditys);
	return "repertorys";
	
}
@RequestMapping("/commoditySelect")
public String commoditySelect(@RequestParam(value="commodityName",defaultValue="")String commodityName,Model model) {
	List<Commodity> commoditySelect=commodityService.commoditySelect(commodityName);
	model.addAttribute("commoditySelect", commoditySelect);
	return "repertorys";
	
}

@RequestMapping("/Commodity")
public String Commodity(@RequestParam(value="commodityid",required=false)int commodityid,Model model) {
	Commodity commodity=commodityService.commoditys(commodityid);
	model.addAttribute("commodity", commodity);
	return "createss";
	
}

@RequestMapping("/commodityDel")
public String commodityDel(@RequestParam("commodityid")int commodityid) {
	int commodityDel=commodityService.commodityDel(commodityid);
	return "redirect:/commoditys";
	
}
@RequestMapping("/Commoditys")
public String Commoditys(@RequestParam(value="commodityid",required=false)int commodityid,Model model) {
	Commodity commodity=commodityService.Commoditys(commodityid);
	model.addAttribute("commodity", commodity);
	return "createsss";
	
}
@RequestMapping("/commodityUpdate")
public String commodityUpdate(@RequestParam("commodity")Commodity commodity,Model model) {
	int Commodity=commodityService.commodityUpdate(commodity);
	model.addAttribute("Commodity", Commodity);
	return "commoditys";
	
}
@RequestMapping("/commodityss")
public String commodityss(Model model) {
	List<Commodity> commodityss=commodityService.commodityss();
	model.addAttribute("commodityss", commodityss);
	return "repertoryInsert";
	
}

@RequestMapping("/commodityadd")
public String commodityadd() {
	return "commodityAdd";
	
}
@ResponseBody
@PostMapping("/commodityAdd")
public String commodityAdd(
		@RequestParam("commodityName")String commodityName,
		@RequestParam("commodityEnter")int commodityEnter,
		@RequestParam("commoditySale")int commoditySale,
		@RequestParam("commodityCost")int commodityCost,
		@RequestParam("state")String state,
		@RequestParam("commodityQuantity")int commodityQuantity,
		@RequestParam(value = "file") MultipartFile file,
		HttpServletRequest request) {
	String name=file.getOriginalFilename();//获取文件名
	String prefix =name.substring(name.lastIndexOf(".")+1);
	String path=request.getSession().getServletContext().getRealPath("/image");
	try {
		File files=new File(path, prefix);
		if (!files.exists()) {
			files.mkdirs();
		}
		file.transferTo(files);
	} catch (Exception e) {
		e.printStackTrace();
	}
	Commodity commodity=new Commodity();
	int commodityAdd=commodityService.commodityInsert(commodity);
	if(commodityAdd>0) {
		return "commoditys";
	}else {
		return "redirect:commodityadd";
	}
	
	
}
}
