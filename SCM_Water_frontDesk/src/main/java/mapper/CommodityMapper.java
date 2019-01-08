package mapper;

import java.util.List;

import pojo.Commodity;

public interface CommodityMapper {
	List<Commodity> selCommodity();
	Commodity selById(int id);
}