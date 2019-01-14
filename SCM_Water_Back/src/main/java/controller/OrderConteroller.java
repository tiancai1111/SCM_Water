package controller;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Order;
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
	
	@ResponseBody
	@RequestMapping("orderAlreadyAll")
	public int orderAlreadySelect(int id) {
		int order = orderservice.orderAlreadySelect();
		return order;
	}
	@RequestMapping("orderAlreadySelect")
	public String orderAlreadySelect() {
		
		
		return "orderAlreadySelect.html";
		
	}
	
}
