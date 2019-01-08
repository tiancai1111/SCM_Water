package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mapper.CommodityMapper;
import mapper.SettleAccountMapper;
import mapper.ShoppingMapper;
import pojo.Commodity;
import pojo.Giftcoupon;
import pojo.Shopping;
import pojo.TakeAddress;
import pojo.UserGiftcoupon;

@Controller
public class SettleAccountController {
	@Autowired
	private SettleAccountMapper settleAccountMapper;
	@Autowired
	private CommodityMapper commodityMapper;
	@Autowired
	private ShoppingMapper shoppingMapper;
	@RequestMapping("settleAccount")
	public String settleAccount(Model model,
			@RequestParam(value="way",defaultValue="0",required=false)int way,
			@RequestParam(value="commodityid",defaultValue="0",required=false)int commodityid,
			@RequestParam(value="count",defaultValue="0",required=false)int count,
			@RequestParam(value="total",defaultValue="0",required=false)Float total) {
		List<TakeAddress> list= settleAccountMapper.selTakeAddressByUserId(2);
		List<UserGiftcoupon> glist=settleAccountMapper.selGiftcouponByUserId(2);
		model.addAttribute("addlist", list);
		model.addAttribute("glist", glist);
		model.addAttribute("way", way);
		model.addAttribute("total", total);
		if(way==1) {
		Commodity commodity=commodityMapper.selById(commodityid);
		model.addAttribute("commodity", commodity);
		model.addAttribute("count", count);
		}else{
	    List<Shopping> slist = shoppingMapper.selByUserId(2);
		model.addAttribute("shoppingList", slist);
		}
		return "lm/settleAccount";
	}
	
	@ResponseBody
	@RequestMapping("selByTaId")
	public TakeAddress selByTaId(Model model,int taId) {
		TakeAddress takeAddress=settleAccountMapper.selByTaId(taId);
		return takeAddress;
	}
	@ResponseBody
	@RequestMapping("selGiftcouponById")
	public UserGiftcoupon selGiftcouponById(Model model,int id) {
		UserGiftcoupon userGiftcoupon=settleAccountMapper.selGiftcouponByUserIdAndId(2, id);
		return userGiftcoupon;
	}

}