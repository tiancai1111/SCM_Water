package mapper;

import pojo.CommodityOrder;

public interface CommodityOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommodityOrder record);

    int insertSelective(CommodityOrder record);

    CommodityOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommodityOrder record);

    int updateByPrimaryKey(CommodityOrder record);
}