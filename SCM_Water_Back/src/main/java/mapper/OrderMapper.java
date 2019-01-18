package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pojo.CommodityOrder;
import pojo.Order;
import pojo.deliverypersonnel;

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
    
    @Select("SELECT `order`.`id`,`delivery`.`deliveryman`,`delivery`.`deliverytime` FROM  `delivery`,`order` WHERE `order`.`id` = `delivery`.`order_id` AND `order`.`id`=#{id}")
    Order OrderDelivery(int id);
    
    @Select("SELECT * FROM `order`,`user` WHERE `user`.`userid` = `order`.`userid` AND  `order`.`status` = '已下单'")
    List<Order> OrderSele();
    
    //修改订单状态
    @Update("UPDATE `order` SET `status` = #{status} WHERE `id` = #{id}")
	int orderAlreadySelect(String status,int id);
    
    //查询已接单信息
    @Select("SELECT * FROM `order` WHERE  status = '已接单'")
	List<Order> DeloveryOrder();
    
    
	//代办任务信息查询
	List<Order> Ordercommission(int id);
	
	//查看派送员
	@Select("SELECT * FROM deliverypersonnel")
	List<deliverypersonnel> CommodityOrder();

	
	//派送人员增加
	@Insert("INSERT INTO `delivery`(`deliverytime`,`deliveryman`,`order_id`)VALUES (NOW(),#{deliveryman},1)")
	int deliveryAdd(@Param("deliveryman")String deliveryman);
	

	//派送状态修改
	@Update("UPDATE `order` SET `status` =  #{status} WHERE `id` = #{id}")
	int deliveryUp(@Param("id")int id,@Param("status")String status);
}