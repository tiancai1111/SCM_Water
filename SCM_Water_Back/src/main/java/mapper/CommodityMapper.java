package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Commodity;

public interface CommodityMapper {
	List<Commodity> commoditySelect(@Param("commodityName")String commodityName);
}