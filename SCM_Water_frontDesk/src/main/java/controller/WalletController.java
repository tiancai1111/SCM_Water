
package controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.WalletService;
import pojo.User;

@Controller
public class WalletController {
	@Autowired
	private WalletService walletService;

	@RequestMapping("wallet")
	public String wallet(Model model,HttpServletRequest request) {
     User user = walletService.selUserById((int)request.getSession().getAttribute("userid"));
     model.addAttribute("userWallet",user);
	return "lm/wallet";
	}
	

}

