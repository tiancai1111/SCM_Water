package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.ShoppingMapper;
import pojo.Shopping;
@Service
public class ShoppingServiceImpl implements ShoppingService{
	@Autowired
	ShoppingMapper shoppingMapper;
	@Override
	public List<Shopping> selByUserId(int userId) {
		// TODO Auto-generated method stub
		return shoppingMapper.selByUserId(userId);
	}
	@Override
	public int addCart(Shopping shopping) {
		// TODO Auto-generated method stub
		return shoppingMapper.addCart(shopping);
	}

	@Override
	public int deleteShopping(int shoppingId) {
		// TODO Auto-generated method stub
		return shoppingMapper.deleteShopping(shoppingId);
	}

	@Override
	public int updateShopping(Shopping shopping) {
		// TODO Auto-generated method stub
		return shoppingMapper.updateShopping(shopping);
	}
	
}
