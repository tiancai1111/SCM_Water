package controller;

import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;

import service.ShoppingService;
import service.WalletService;
import pojo.Order;
import pojo.Shopping;
import pojo.User;
import util.AlipayConfig;
import util.RandomUtil;

@Controller
public class PayController {
	@Autowired
	private WalletService walletService;
	@Autowired
	private ShoppingService shoppingService;

	@RequestMapping("topUp")
	public String topUp(@RequestParam("amount") Float amount, Model mdoel) {
		mdoel.addAttribute("subject", "充值");
		mdoel.addAttribute("body", "我的钱包充值");
		amount = (float) (amount * 0.9);
		DecimalFormat df = new DecimalFormat("#.00");
		String amount1 = df.format(amount);
		mdoel.addAttribute("amount", amount1);
		return "pay/index";
	}

	@RequestMapping("pay")
	public Object pay(Model model, @RequestParam("WIDtotal_amount") String total_amount,
			@RequestParam("WIDsubject") String subject, @RequestParam("WIDbody") String body,
			HttpServletResponse response) throws Exception {
		// 获得初始化的AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
				AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
				AlipayConfig.sign_type);
		// 设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
		/* SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS"); */
		// 商户订单号，商户网站订单系统中唯一订单号，必填
		String out_trade_no = RandomUtil.getRandomNum();
		alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
				+ "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		// 请求
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		/*
		 * AlipayConfig.logResult(result);// 记录支付日志
		 */ response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		return null;
	}
	
	@RequestMapping("return_url")
	public String return_url(HttpServletResponse response, HttpServletRequest request) throws Exception {
		int userid=(int)request.getSession().getAttribute("userid");
		String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");
		User user = walletService.selUserById(userid);
		float money = Float.parseFloat(total_amount);
		walletService.updUserMoney(money + user.getMoney(), userid);
		return "redirect:wallet";
	}

	@ResponseBody
	@RequestMapping("selByUserId")
	public User selByUserId(HttpServletRequest request) {
		User user = walletService.selUserById((int)request.getSession().getAttribute("userid"));
		return user;
	}


	@ResponseBody
	@RequestMapping("placeOrder")
	public int selByUserId(HttpServletRequest request,Order order, @RequestParam("way") int way, @RequestParam("giftcouponId") int giftcouponId,
			@RequestParam(value = "commodityidd", required = false, defaultValue = "0") int commodityidd,
			@RequestParam(value = "count", required = false, defaultValue = "0") int count) {
		int result = 1;
		int userid=(int)request.getSession().getAttribute("userid");
		try {
			order.setUserid(userid);
			order.setNumberr(RandomUtil.getRandomNum());
			// 查询用户表信息
			User user = walletService.selUserById(userid);
			// 修改用户钱包余额
			walletService.updUserMoney(user.getMoney() - order.getMoney(), userid);
			// 删除使用的优惠卷
			walletService.delUserGiftcouponById(giftcouponId);
			// 添加订单
			walletService.addOrder(order);
			// 查询刚下的订单
			int orderId = walletService.selMaxOderId();
			// 购物车购买
			if (way == 0) {
				// 查看购物车
				List<Shopping> shoppingList = shoppingService.selByUserId(userid);
				// 删除购物车商品
				walletService.delCartByUserId(userid);
				// 添加订单详情
				walletService.addCommodityOrder(shoppingList, orderId);
			}
			// 直接购买
			else {
				// 添加订单详情
				walletService.insertCommodityOrder(commodityidd, orderId, count);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}

}
