package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.SettleAccountMapper;
import pojo.TakeAddress;
import pojo.UserGiftcoupon;
@Service
public class SettleAccountServiceImpl implements SettleAccountService{
	@Autowired
	SettleAccountMapper settleAccountMapper;
	@Override
	public List<TakeAddress> selTakeAddressByUserId(int userId) {
		// TODO Auto-generated method stub
		return settleAccountMapper.selTakeAddressByUserId(userId);
	}

	@Override
	public TakeAddress selByTaId(int taId) {
		// TODO Auto-generated method stub
		return settleAccountMapper.selByTaId(taId);
	}

	@Override
	public List<UserGiftcoupon> selGiftcouponByUserId(int userId) {
		// TODO Auto-generated method stub
		return settleAccountMapper.selGiftcouponByUserId(userId);
	}

	@Override
	public UserGiftcoupon selGiftcouponByUserIdAndId(int userId, int id) {
		// TODO Auto-generated method stub
		return settleAccountMapper.selGiftcouponByUserIdAndId(userId, id);
	}
	
}
