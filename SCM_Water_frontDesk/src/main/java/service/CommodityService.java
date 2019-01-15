package service;

import java.util.List;

import pojo.Commodity;

public interface CommodityService {
	List<Commodity> selCommodity();
	Commodity selById(int id);
}
