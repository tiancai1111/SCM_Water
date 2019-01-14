package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.GiftcouponMapper;
import mapper.UserMapper;
import pojo.Giftcoupon;
import pojo.User;
@Service
public class GiftcouponSericeImpl implements GiftcouponSerice{
	@Resource
	private GiftcouponMapper giftcouponMapper;
	@Resource UserMapper userMapper;
	@Override
	public List<Giftcoupon> findGiftcouponList() {
		// TODO Auto-generated method stub
		return giftcouponMapper.findGiftcouponList();
	}
	@Override
	public int addUser_Giftcoupon(Integer gcId, int userid,Integer gcRequired) {
		// TODO Auto-generated method stub
		User user=userMapper.selectUser(userid);
		System.out.println(user.getIntegrate());
		if(gcRequired<=user.getIntegrate()) {
			userMapper.updateUserIntegrate(user.getIntegrate()-gcRequired,userid);
			return giftcouponMapper.addUser_Giftcoupon(gcId,userid);
		}else {
			return 0;
		}
		
	}

}
