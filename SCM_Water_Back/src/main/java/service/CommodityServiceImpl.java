package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CommodityMapper;
import pojo.Commodity;
@Service
public class CommodityServiceImpl implements CommodityService{
@Autowired
private CommodityMapper commodityMapper;

@Override
public List<Commodity> commodity() {
	// TODO Auto-generated method stub
	return commodityMapper.commodity();
}

@Override
public List<Commodity> commoditySelect(String commodityName) {
	// TODO Auto-generated method stub
	return commodityMapper.commoditySelect(commodityName);
}

@Override
public Commodity commoditys(int commodityid) {
	// TODO Auto-generated method stub
	return commodityMapper.commoditys(commodityid);
}

@Override
public int commodityDel(int commodityid) {
	// TODO Auto-generated method stub
	return commodityMapper.commodityDel(commodityid);
}

@Override
public int commodityUpdate(Commodity commodity) {
	// TODO Auto-generated method stub
	return commodityMapper.commodityUpdate(commodity);
}

@Override
public Commodity Commoditys(int commodityid) {
	// TODO Auto-generated method stub
	return commodityMapper.Commoditys(commodityid);
}

@Override
public List<Commodity> commodityss() {
	// TODO Auto-generated method stub
	return commodityMapper.commodityss();
}

@Override
public int commodityInsert(Commodity commodity) {
	// TODO Auto-generated method stub
	return commodityMapper.commodityInsert(commodity);
}




	
}
