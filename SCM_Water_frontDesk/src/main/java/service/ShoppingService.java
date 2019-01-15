package service;

import java.util.List;

import pojo.Shopping;

public interface ShoppingService {
	List<Shopping> selByUserId(int userId);
	int addCart(Shopping shopping);
	int deleteShopping(int shoppingId);
	int updateShopping(Shopping shopping);
}
