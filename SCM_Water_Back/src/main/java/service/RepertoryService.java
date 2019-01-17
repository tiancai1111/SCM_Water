package service;

import java.util.List;


import pojo.Repertory;

public interface RepertoryService {
	List<Repertory> list();
	List<Repertory> repertory(String commodityName);
	Repertory repertoryDetails(int repertoryid);
	int repertoryDel(int repertoryid);
	Repertory repertorys(int repertoryid);
	int repertoryUpdate(int repertoryid,String repertorystate);
	int repertoryInsert(Repertory repertory);
	int repertoryStock(int commodityid,int repertoryamount);
	int repertoryss(int commodityId);
	
}
