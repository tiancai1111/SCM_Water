package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CommodityMapper;
import pojo.Commodity;
@Service
public class CommodityServiceImpl implements  CommodityService{
	@Autowired
	CommodityMapper commodityMapper;

	@Override
	public List<Commodity> selCommodity() {
		// TODO Auto-generated method stub
		return commodityMapper.selCommodity();
	}

	@Override
	public Commodity selById(int id) {
		// TODO Auto-generated method stub
		return commodityMapper.selById(id);
	}

}
