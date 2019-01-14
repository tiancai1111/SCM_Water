package service;

import java.util.List;

import pojo.Order;

public interface OrderService {
	
	//查看订单
	List<Order> OrderSeleAll();

	//订单详情
	List<Order> OrderAll(int id);

	//订单详情
	Order OrderDelivery(int id);
	
	//待办任务
	List<Order> OrderSele();

	//修改订单状态
	int orderAlreadySelect();
	
}
