package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.annotation.Transactional;
import mapper.WalletMapper;
import pojo.Order;
import pojo.Shopping;
import pojo.User;
@Service
@Transactional
public class WalletServiceImpl implements WalletService{
	@Autowired
	WalletMapper walletMapper;
	
	public User selUserById(int userId)  {
		// TODO Auto-generated method stub
		return walletMapper.selUserById(userId);
	}

	@Override
	public int selMaxOderId() {
		// TODO Auto-generated method stub
		return walletMapper.selMaxOderId();
	}
	
	@Override
	public int updUserMoney(float money, int userId) {
		// TODO Auto-generated method stub
		return walletMapper.updUserMoney(money, userId);
	}

	@Override
	public int minusUserMoney(float money, int userId) {
		// TODO Auto-generated method stub
		return walletMapper.minusUserMoney(money, userId);
	}

	@Override
	public int addOrder(Order order){
		// TODO Auto-generated method stub
		return walletMapper.addOrder(order);
	}

	@Override
	public int delCartByUserId(int userId){
		// TODO Auto-generated method stub
		return walletMapper.delCartByUserId(userId);
	}

	@Override
	public int addCommodityOrder(List<Shopping> shoppingList, int orderId){
		// TODO Auto-generated method stub
		return walletMapper.addCommodityOrder(shoppingList, orderId);
	}

	@Override
	public int insertCommodityOrder(int commodityIdd, int orderId, int count) throws TransactionException{
		// TODO Auto-generated method stub
		return walletMapper.insertCommodityOrder(commodityIdd, orderId, count);
	}

	@Override
	public int delUserGiftcouponById(int id) throws TransactionException{
		// TODO Auto-generated method stub
		return walletMapper.delUserGiftcouponById(id);
	}
	
	
	
}
