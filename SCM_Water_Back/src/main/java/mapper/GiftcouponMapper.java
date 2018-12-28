package mapper;

import pojo.Giftcoupon;

public interface GiftcouponMapper {
    int deleteByPrimaryKey(Integer gcId);

    int insert(Giftcoupon record);

    int insertSelective(Giftcoupon record);

    Giftcoupon selectByPrimaryKey(Integer gcId);

    int updateByPrimaryKeySelective(Giftcoupon record);

    int updateByPrimaryKey(Giftcoupon record);
}