package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mapper.SettleAccountMapper;
import pojo.TakeAddress;

@Controller
public class SettleAccountController {
	@Autowired
	private SettleAccountMapper settleAccountMapper;
	

	@RequestMapping("settleAccount")
	public String settleAccount(Model model) {
		List<TakeAddress> list= settleAccountMapper.selTakeAddressByUserId(2);
		model.addAttribute("addlist", list);
		return "lm/settleAccount";
	}

}