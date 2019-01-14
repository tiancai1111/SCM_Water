package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.OrderMapper;
import pojo.Order;
import pojo.Staff;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper ordermapper;
	
	@Override
	public List<Order> OrderSeleAll() {
		return ordermapper.OrderSeleAll();
	}

	@Override
	public List<Order> OrderAll(int id) {
		return ordermapper.OrderAll(id);
	}

	@Override
	public Order OrderDelivery(int id) {
		return ordermapper.OrderDelivery(id);
	}

	@Override
	public List<Order> OrderSele() {
		return ordermapper.OrderSele();
	}

	@Override
	public int orderAlreadySelect() {
		return ordermapper.orderAlreadySelect();
	}
	
}