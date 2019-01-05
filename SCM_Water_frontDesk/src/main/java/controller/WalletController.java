
package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mapper.WalletMapper;
import pojo.User;

@Controller
public class WalletController {
	@Autowired
	private WalletMapper walletMapper;

	@RequestMapping("wallet")
	public String wallet(Model model) {
     User user = walletMapper.selUserMoneyById(2);
     model.addAttribute("userWallet",user);
	return "lm/wallet";
	}
	

}

