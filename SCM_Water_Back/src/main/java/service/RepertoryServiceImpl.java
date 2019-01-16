package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.RepertoryMapper;
import pojo.Commodity;
import pojo.Repertory;
@Service
public class RepertoryServiceImpl implements RepertoryService {
@Autowired
private RepertoryMapper repertoryMapper;
	@Override
	public List<Repertory> repertory(String commodityName) {
		// TODO Auto-generated method stub
		return repertoryMapper.repertory(commodityName);
	}
	@Override
	public Repertory repertoryDetails(int repertoryid) {
		// TODO Auto-generated method stub
		return repertoryMapper.repertoryDetails(repertoryid);
	}
	@Override
	public int repertoryDel(int repertoryid) {
		// TODO Auto-generated method stub
		return repertoryMapper.repertoryDel(repertoryid);
	}
	@Override
	public Repertory repertorys(int repertoryid) {
		// TODO Auto-generated method stub
		return repertoryMapper.repertorys(repertoryid);
	}
	@Override
	public int repertoryUpdate(int repertoryid, String repertorystate) {
		// TODO Auto-generated method stub
		return repertoryMapper.repertoryUpdate(repertoryid, repertorystate);
	}
	@Override
	public int repertoryInsert(Repertory repertory) {
		// TODO Auto-generated method stub
		return repertoryMapper.repertoryInsert(repertory);
	}
	@Override
	public int repertoryStock(int commodityid,int repertoryamount) {
		// TODO Auto-generated method stub
		return repertoryMapper.repertoryStock(commodityid, repertoryamount);
	}
	@Override
	public int repertoryss(int commodityId) {
		// TODO Auto-generated method stub
		return repertoryMapper.repertoryss(commodityId);
	}
	@Override
	public List<Repertory> list() {
		// TODO Auto-generated method stub
		return repertoryMapper.list();
	}
	 
	
	
	 
	 
	

}
