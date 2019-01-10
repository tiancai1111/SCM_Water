package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Chargeback;
import service.ChargebackService;

@Controller
public class chargebackController {
	@Autowired
	private ChargebackService chargebackService;
	@RequestMapping("/echartsTests")
	public String echartsTest() {
		return "echartsTests";
	}
   @RequestMapping("/chargeback")
   @ResponseBody
   public List<Chargeback> chargeback(){
	List<Chargeback> chargeback=chargebackService.chargeback();
	return chargeback;
}
}
