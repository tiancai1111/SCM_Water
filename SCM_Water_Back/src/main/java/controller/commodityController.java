package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import pojo.Commodity;
import service.CommodityService;
import util.FileUploadUtil;

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
public String commoditySelect(@RequestParam(value="commodityName",defaultValue="")String commodityName,@RequestParam(value="num",defaultValue="1")int num,Model model) {
    int pagesize=3;
    PageHelper.startPage(num, pagesize);
	List<Commodity> commoditySelect=commodityService.commoditySelect(commodityName);
	PageInfo<Commodity> commodityPageInfos = new PageInfo<Commodity>(commoditySelect); 
	model.addAttribute("commodityPageInfos", commodityPageInfos);
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

@RequestMapping("commodityAdd")
public String commodityAdd(
		@RequestParam(value = "commodityName")String commodityName,
		@RequestParam(value = "commodityEnter")double commodityEnter,
		@RequestParam(value = "commoditySale")double commoditySale,
		@RequestParam(value = "commodityCost")double commodityCost,
		@RequestParam(value = "state")String state,
		@RequestParam(value = "commodityQuantity")int commodityQuantity,
		@RequestParam(value = "myFile") MultipartFile myFile,
		HttpServletRequest request) {
	Commodity commodity=new Commodity();
	String uuid = UUID.randomUUID().toString();
	if (myFile.getOriginalFilename() != null && !myFile.getOriginalFilename().equals("")) {
		String oldFileName = myFile.getOriginalFilename();
		String suffix = FilenameUtils.getExtension(oldFileName);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd\\HH\\mm\\ss");
		String dataStr = format.format(new Date());
		String statics = request.getSession().getServletContext().getRealPath("statics");
		String filePath03 = statics + "\\images\\" + dataStr;
		String filePath04 = filePath03 + "\\" + uuid + "." + suffix;
		String filePath05 = filePath04.substring(filePath04.indexOf("statics"), filePath04.length());
		commodity.setImg(filePath05);
		try {
			FileUploadUtil.uploadFile(myFile, filePath03, filePath04);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	commodity.setCommodityname(commodityName);
	commodity.setCommodityenter(commodityEnter);
	commodity.setCommoditysale(commoditySale);
	commodity.setCommoditycost(commodityCost);
	commodity.setState(state);
	commodity.setCommodityQuantity(commodityQuantity);
	
	int commodityAdd=commodityService.commodityInsert(commodity);
	if(commodityAdd>0) {
		return "redirect:commoditySelect";
	}else {
	return "redirect:commodityadd";
	}

}
@RequestMapping("update")
public String update(
		@RequestParam(value = "commodityid")int commodityid,
		@RequestParam(value = "commodityname")String commodityname,
		@RequestParam(value = "commodityenter")double commodityenter,
		@RequestParam(value = "commoditysale")double commoditysale,
		@RequestParam(value = "commoditycost")double commoditycost,
		@RequestParam(value = "state")String state,
		@RequestParam(value = "commodityQuantity")int commodityQuantity,
		@RequestParam(value = "myFile") MultipartFile myFile,
		HttpServletRequest request) {
	Commodity commodity=new Commodity();
	String uuid = UUID.randomUUID().toString();
	if (myFile.getOriginalFilename() != null && !myFile.getOriginalFilename().equals("")) {
		String oldFileName = myFile.getOriginalFilename();
		String suffix = FilenameUtils.getExtension(oldFileName);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd\\HH\\mm\\ss");
		String dataStr = format.format(new Date());
		String statics = request.getSession().getServletContext().getRealPath("statics");
		String filePath03 = statics + "\\images\\" + dataStr;
		String filePath04 = filePath03 + "\\" + uuid + "." + suffix;
		String filePath05 = filePath04.substring(filePath04.indexOf("statics"), filePath04.length());
		commodity.setImg(filePath05);
		try {
			FileUploadUtil.uploadFile(myFile, filePath03, filePath04);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	commodity.setCommodityid(commodityid);
	commodity.setCommodityname(commodityname);
	commodity.setCommodityenter(commodityenter);
	commodity.setCommoditysale(commoditysale);
	commodity.setCommoditycost(commoditycost);
	commodity.setState(state);
	commodity.setCommodityQuantity(commodityQuantity);
	
	int update=commodityService.commodityUpdate(commodity);
	if(update>0) {
		return "redirect:commoditySelect";
	}else {
	return "redirect:commodityadd";
	}

}
}
