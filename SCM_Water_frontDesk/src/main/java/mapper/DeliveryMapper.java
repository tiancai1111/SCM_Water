package mapper;

import pojo.Delivery;

public interface DeliveryMapper {
    int deleteByPrimaryKey(Integer deliveryid);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    Delivery selectByPrimaryKey(Integer deliveryid);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);
}