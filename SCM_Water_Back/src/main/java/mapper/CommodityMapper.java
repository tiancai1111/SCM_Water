package mapper;

import pojo.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(Integer commodityid);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer commodityid);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}