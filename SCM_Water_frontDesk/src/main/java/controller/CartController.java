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

	@ResponseBody
	@RequestMapping("addCart")
	public int addCart(Shopping shopping) {
		shopping.setUserId(2);
		int result = shoppingMapper.addCart(shopping);
		return result;
	}
	
	@ResponseBody
	@RequestMapping("delCart")
	public int delCart(int shoppingId) {
		int result = shoppingMapper.deleteShopping(shoppingId);
		return result;
	}
	
	@ResponseBody
	@RequestMapping("updCart")
	public int updCart(Shopping shopping) {
		int result = shoppingMapper.updateShopping(shopping);
		return result;
	}
	
	
	

}