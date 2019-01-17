package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.OrderMapper;
import pojo.Order;
import pojo.Staff;
import pojo.deliverypersonnel;
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
	public int orderAlreadySelect(String status,int id) {
		return ordermapper.orderAlreadySelect(status,id);
	}

	@Override
	public List<Order> DeloveryOrder() {
		return ordermapper.DeloveryOrder();
	}

	@Override
	public List<Order> Ordercommission(int id) {
		// TODO Auto-generated method stub
		return ordermapper.Ordercommission(id);
	}

	@Override
	public List<deliverypersonnel> CommodityOrder() {
		return ordermapper.CommodityOrder();
	}
	
}