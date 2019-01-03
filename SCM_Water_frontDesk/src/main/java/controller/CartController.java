package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mapper.ShoppingMapper;
import pojo.Shopping;

@Controller
public class CartController {
	@Autowired
	private ShoppingMapper shoppingMapper;

	
	@RequestMapping("cart")
	public String cart(Model model) {
     List<Shopping> list = shoppingMapper.selByUserId(2);
		model.addAttribute("shoppingList", list);
		return "lm/cart";
	}
	
	/*@ResponseBody
	@RequestMapping("selCart")
	public List<Shopping> selCart(Model model) {
		List<Shopping> list = shoppingMapper.selByUserId(2);
		
		return list;
	}*/
}
