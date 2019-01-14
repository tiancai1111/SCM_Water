package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.GiftcouponMapper;
import pojo.Giftcoupon;
@Service
public class GiftcouponSericeImpl implements GiftcouponSerice{
	@Resource
	private GiftcouponMapper giftcouponMapper;
	@Override
	public List<Giftcoupon> findGiftcouponList() {
		// TODO Auto-generated method stub
		return giftcouponMapper.findGiftcouponList();
	}
	@Override
	public int addUser_Giftcoupon(Integer gcId, int userid) {
		// TODO Auto-generated method stub
		return giftcouponMapper.addUser_Giftcoupon(gcId,userid);
	}

}
