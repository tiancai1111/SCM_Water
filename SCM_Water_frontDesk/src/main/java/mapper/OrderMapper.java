package mapper;

import java.util.List;

import pojo.Order;

public interface OrderMapper {
	List<Order> selOrderById(int userId);
	List<Order> selOrderDetailsBy(int orderId);
	Order selectOrder(int id);
	int updStatusById(int id);
}