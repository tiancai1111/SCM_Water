package mapper;

import pojo.Stock;

public interface StockMapper {
    int deleteByPrimaryKey(Integer stockid);

    int insert(Stock record);

    int insertSelective(Stock record);

    Stock selectByPrimaryKey(Integer stockid);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}