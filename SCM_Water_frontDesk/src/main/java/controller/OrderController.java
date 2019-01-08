package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mapper.OrderMapper;
import pojo.Order;

@Controller
public class OrderController {
	@Autowired
	private OrderMapper orderMapper;
	
	@RequestMapping("myorder")
	public String myorder(Model model) {
		List<Order> list=orderMapper.selOrderById(2);
		for (Order order : list) {
			int orderId=order.getId();
			List<Order> detaiList=orderMapper.selOrderDetailsBy(orderId);
			order.setOrderDetails(detaiList);
		}
		model.addAttribute("orderList", list);
		return "lm/myorder";
	}
	
}
