package service;

import java.util.List;

import pojo.Giftcoupon;

public interface GiftcouponSerice {
   List<Giftcoupon> findGiftcouponList();

   int addUser_Giftcoupon(Integer gcId, int id, Integer gcRequired);
   
}
