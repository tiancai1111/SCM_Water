package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pojo.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    //查看订单
    @Select("SELECT * FROM `order`,`user` WHERE `user`.`userid` = `order`.`userid` AND  `order`.`status` = '已签收'")
    List<Order> OrderSeleAll();
    
    List<Order> OrderAll(int id);
    
    @Select("SELECT `delivery`.`deliveryman`,`delivery`.`deliverytime` FROM  `delivery`,`order` WHERE `order`.`id` = `delivery`.`order_id` AND `order`.`id`=#{id}")
    Order OrderDelivery(int id);
    
    @Select("SELECT * FROM `order`,`user` WHERE `user`.`userid` = `order`.`userid` AND  `order`.`status` = '已下单'")
    List<Order> OrderSele();
    
    //修改订单状态
    @Update("UPDATE `order` SET `status` = #{status} WHERE `id` = #{id}")
	int orderAlreadySelect();

}