package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import pojo.Giftcoupon;

public interface GiftcouponMapper {
    int deleteByPrimaryKey(Integer gcId);

    int insert(Giftcoupon record);

    int insertSelective(Giftcoupon record);
   
    Giftcoupon selectByPrimaryKey(Integer gcId);
    
    int updateByPrimaryKeySelective(Giftcoupon record);

    int updateByPrimaryKey(Giftcoupon record);
    List<Giftcoupon> findGiftcouponList();
    @Insert("INSERT INTO `scm_water`.`user_giftcoupon`(`uid`,`gcid`)VALUES (#{uid},#{gcid})")
	int addUser_Giftcoupon(@Param("gcid")Integer gcId,@Param("uid") int userid);
}