package controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.OrderService;
import pojo.Order;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("myorder")
	public String myorder(Model model,HttpServletRequest request) {
		List<Order> list=orderService.selOrderById( (int) request.getSession().getAttribute("userid"));
		for (Order order : list) {
			int orderId=order.getId();
			List<Order> detaiList=orderService.selOrderDetailsBy(orderId);
			order.setOrderDetails(detaiList);
		}
		model.addAttribute("orderList", list);
		return "lm/myorder";
	}
	@ResponseBody
	@RequestMapping("selectOrderById")
	public Order selectOrderById(int id) {
		Order order=orderService.selectOrder(id);
		return order;
	}
	@ResponseBody
	@RequestMapping("sign")
	public int sign(int id) {
		int count=orderService.updStatusById(id);
		return count;
	}
}
