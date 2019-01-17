package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.OrderMapper;
import pojo.Order;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderMapper orderMapper;

	@Override
	public List<Order> selOrderById(int userId) {
		// TODO Auto-generated method stub
		return orderMapper.selOrderById(userId);
	}

	@Override
	public List<Order> selOrderDetailsBy(int orderId) {
		// TODO Auto-generated method stub
		return orderMapper.selOrderDetailsBy(orderId);
	}

	@Override
	public Order selectOrder(int id) {
		// TODO Auto-generated method stub
		return orderMapper.selectOrder(id);
	}

	@Override
	public int updStatusById(int id) {
		// TODO Auto-generated method stub
		return orderMapper.updStatusById(id);
	}
	
}
