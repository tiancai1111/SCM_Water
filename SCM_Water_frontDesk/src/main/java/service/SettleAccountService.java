package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.TakeAddress;
import pojo.UserGiftcoupon;

public interface SettleAccountService {
	List<TakeAddress> selTakeAddressByUserId(int userId);
	TakeAddress selByTaId(int taId);
	List<UserGiftcoupon> selGiftcouponByUserId(int userId);
	UserGiftcoupon selGiftcouponByUserIdAndId(@Param("userId")int userId,@Param("id")int id);

}
