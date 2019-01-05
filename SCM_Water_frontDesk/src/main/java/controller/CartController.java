package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

}