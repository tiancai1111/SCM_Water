package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Commodity;

public interface CommodityMapper {
	List<Commodity> commodityss();
	List<Commodity> commodity();
	List<Commodity> commoditySelect(@Param("commodityName")String commodityName);
	Commodity commoditys(@Param("commodityid")int commodityid);
	int commodityDel(@Param("commodityid")int commodityid);
	int commodityUpdate(@Param("commodity")Commodity commodity);
	Commodity Commoditys(@Param("commodityid")int commodityid);
	int commodityInsert(@Param("commodity")Commodity commodity);
	
}