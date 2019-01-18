package service;

import java.util.List;

import pojo.CommodityOrder;
import pojo.Order;
import pojo.deliverypersonnel;

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
	int orderAlreadySelect(String status,int id);

	//查询已接单信息
	List<Order> DeloveryOrder();

	//代办任务信息查询
	List<Order> Ordercommission(int id);

	List<deliverypersonnel> CommodityOrder();

	//派送人员增加
	int deliveryAdd(String deliveryman);

	//派送状态修改
	int deliveryUp(int id, String status);
	
}
