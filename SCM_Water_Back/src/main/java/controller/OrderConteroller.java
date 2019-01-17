package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.CommodityOrder;
import pojo.Order;
import pojo.deliverypersonnel;
import service.OrderService;


@Controller
public class OrderConteroller {
	
	@Autowired 
	private OrderService orderservice;
	
	@RequestMapping("order")
	public String order(Model model) {
		List<Order> order = orderservice.OrderSeleAll();
		model.addAttribute("order", order);
		return "order_zf.html";
	}
	
	//进入派送
	 @RequestMapping("delivery")
	   public String delivery(Model model) {
		 List<Order> list = orderservice.DeloveryOrder();
		 model.addAttribute("list", list);
 			return "delivery_zf.html";
	   }
	
	//订单详情查看
	@RequestMapping("orderSelectAll")
	public String orderSelectAll(int id,Model model) {
		 List<Order> orderAll = orderservice.OrderAll(id);
		 Order order = orderservice.OrderDelivery(id);
		 model.addAttribute("orderAll", orderAll);
	     model.addAttribute("order", order);
		return "OrderSelect_zf.html";
	}
	
	
	@RequestMapping("orderAlready")
	public String orderAlready(Model model) {
		List<Order> order = orderservice.OrderSele();
		model.addAttribute("order", order);
		return "orderAlready_zf.html";
	}
	

	//订单审核查询
	@RequestMapping("orderAlreadySelect")
	public String orderAlreadySelect(int id,Model model) {
		List<Order> orderAll = orderservice.Ordercommission(id);
		 /*List<Order> orderAll = orderservice.OrderAll(id);*/
		/* Order order = orderservice.OrderDelivery(id);*/
		 model.addAttribute("orderAll", orderAll);
	     /*model.addAttribute("order", order);*/
		return "orderAlreadySelect.html";
	}
	
	
	//修改订单状态
	@ResponseBody
	@PostMapping("OrderSeleId")
	public int OrderSeleId(@RequestParam(value="status")String status,int id) {
		int order = orderservice.orderAlreadySelect(status,id);
		return order;
	}
	

	@RequestMapping("DeliveryOrder")
	public String DeliveryOrder(int id,Model model,HttpSession session) {
		List<deliverypersonnel> lis = orderservice.CommodityOrder();
		model.addAttribute("lis", lis);
		session.setAttribute("id", id);
		return "deliverySelect_zf.html";
	}
}
