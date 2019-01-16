package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.TakeAddressMapper;
import pojo.TakeAddress;
@Service
public class TakeAddressServiceImpl implements TakeAddressService{
	@Resource
    private TakeAddressMapper takeAddressMapper;
    
	@Override
	public int add(TakeAddress takeAddress) {
		// TODO Auto-generated method stub
		return takeAddressMapper.insertSelective(takeAddress);
	}

	@Override
	public int delect(TakeAddress takeAddress) {
		// TODO Auto-generated method stub
		return takeAddressMapper.delete(takeAddress.getTaId());
	}

	@Override
	public int update(TakeAddress takeAddress) {
		// TODO Auto-generated method stub
		return takeAddressMapper.updateByPrimaryKeySelective(takeAddress);
	}

	@Override
	public List<TakeAddress> select(int userid) {
		// TODO Auto-generated method stub
		return takeAddressMapper.selectByPrimaryKey(userid);
	}

	@Override
	public TakeAddress findByTakeAddress(Integer taId) {
		// TODO Auto-generated method stub
		return takeAddressMapper.findByTakeAddress(taId);
	}
   
}
