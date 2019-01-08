package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class buyController {
	
	@RequestMapping("buy")
	public String cart(Model model,@RequestParam("commodityid")int commodityid,@RequestParam("count")int count,@RequestParam("total")Float total) {
		model.addAttribute("count", count);
		model.addAttribute("total", total);
		return "redirect:settleAccount";
	}

}