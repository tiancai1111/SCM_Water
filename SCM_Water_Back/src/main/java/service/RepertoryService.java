package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Commodity;
import pojo.Repertory;

public interface RepertoryService {
	List<Repertory> repertory(String commodityName);
	Repertory repertoryDetails(int repertoryid);
	int repertoryDel(int repertoryid);
	Repertory repertorys(int repertoryid);
	int repertoryUpdate(int repertoryid);
	
}
