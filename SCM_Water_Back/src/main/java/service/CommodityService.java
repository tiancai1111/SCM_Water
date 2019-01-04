package service;

import java.util.List;

import pojo.Commodity;

public interface CommodityService {
	List<Commodity> commoditySelect(String commodityName);
}
