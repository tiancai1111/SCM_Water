package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.ShoppingService;
import pojo.Shopping;

@Controller
public class CartController {
	@Autowired
	private ShoppingService shoppingService;

	@RequestMapping("cart")
	public String cart(Model model, HttpServletRequest request) {
		int userid=(int) request.getSession().getAttribute("userid");
		List<Shopping> list = shoppingService.selByUserId(userid);
		model.addAttribute("shoppingList", list);
		return "lm/cart";
	}

	@ResponseBody
	@RequestMapping("addCart")
	public int addCart(Shopping shopping,HttpServletRequest request) {
		int userid=(int) request.getSession().getAttribute("userid");
		shopping.setUserId(userid);
		int result = shoppingService.addCart(shopping);
		return result;
	}

	@ResponseBody
	@RequestMapping("delCart")
	public int delCart(int shoppingId) {
		int result = shoppingService.deleteShopping(shoppingId);
		return result;
	}

	@ResponseBody
	@RequestMapping("updCart")
	public int updCart(Shopping shopping) {
		int result = shoppingService.updateShopping(shopping);
		return result;
	}

}