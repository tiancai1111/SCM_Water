package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.CommodityService;
import service.SettleAccountService;
import service.ShoppingService;
import pojo.Commodity;
import pojo.Shopping;
import pojo.TakeAddress;
import pojo.UserGiftcoupon;

@Controller
public class SettleAccountController {
	@Autowired
	private SettleAccountService settleAccountService;
	@Autowired
	private CommodityService commodityService;
	@Autowired
	private ShoppingService shoppingService;

	@RequestMapping("settleAccount")
	public String settleAccount(HttpServletRequest request, Model model,
			@RequestParam(value = "way", defaultValue = "0", required = false) int way,
			@RequestParam(value = "commodityid", defaultValue = "0", required = false) int commodityid,
			@RequestParam(value = "count", defaultValue = "0", required = false) int count,
			@RequestParam(value = "total", defaultValue = "0", required = false) Float total) {
		int userid = (int) request.getSession().getAttribute("userid");
		List<TakeAddress> list = settleAccountService.selTakeAddressByUserId(userid);
		List<UserGiftcoupon> glist = settleAccountService.selGiftcouponByUserId(userid);
		model.addAttribute("addlist", list);
		model.addAttribute("glist", glist);
		model.addAttribute("way", way);
		model.addAttribute("total", total);
		if (way == 1) {
			Commodity commodity = commodityService.selById(commodityid);
			model.addAttribute("commodity", commodity);
			model.addAttribute("count", count);
		} else {
			List<Shopping> slist = shoppingService.selByUserId(userid);
			model.addAttribute("shoppingList", slist);
		}
		return "lm/settleAccount";
	}

	@ResponseBody
	@RequestMapping("selByTaId")
	public TakeAddress selByTaId(Model model, int taId) {
		TakeAddress takeAddress = settleAccountService.selByTaId(taId);
		return takeAddress;
	}

	@ResponseBody
	@RequestMapping("selGiftcouponById")
	public UserGiftcoupon selGiftcouponById(Model model, int id, HttpServletRequest request) {
		int userid=(int) request.getSession().getAttribute("userid");
		UserGiftcoupon userGiftcoupon = settleAccountService
				.selGiftcouponByUserIdAndId(userid, id);
		return userGiftcoupon;
	}

}