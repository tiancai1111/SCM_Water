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
	public List<Commodity> commoditySelect(String commodityName) {
		// TODO Auto-generated method stub
		return commodityMapper.commoditySelect(commodityName);
	}

}
