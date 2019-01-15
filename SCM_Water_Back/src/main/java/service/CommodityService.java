package service;

import java.util.List;


import pojo.Commodity;

public interface CommodityService {
	List<Commodity> commodityss();
	List<Commodity> commodity();
	List<Commodity> commoditySelect(String commodityName);
	Commodity commoditys(int commodityid);
	int commodityDel(int commodityid);
	int commodityUpdate(Commodity commodity);
	Commodity Commoditys(int commodityid);
	int commodityInsert(Commodity commodity);
	int count(String commodityName);

}
