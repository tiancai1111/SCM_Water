package mapper;

import pojo.UserGiftcoupon;

public interface UserGiftcouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserGiftcoupon record);

    int insertSelective(UserGiftcoupon record);

    UserGiftcoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserGiftcoupon record);

    int updateByPrimaryKey(UserGiftcoupon record);
}