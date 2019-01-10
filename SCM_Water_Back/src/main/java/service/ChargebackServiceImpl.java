package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.ChargebackMapper;
import pojo.Chargeback;
@Service
public class ChargebackServiceImpl implements ChargebackService {
@Autowired
private ChargebackMapper chargebackMapper;
	@Override
	public List<Chargeback> chargeback() {
		// TODO Auto-generated method stub
		return chargebackMapper.chargeback();
	}

}
