package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Repertory;

public interface RepertoryMapper {
	
	List<Repertory> repertory(@Param("commodityName")String commodityName);
	Repertory repertoryDetails(@Param("repertoryid")int repertoryid);
	int repertoryDel(@Param("repertoryid") int repertoryid);
	Repertory repertorys(@Param("repertoryid")int repertoryid);
	int repertoryUpdate(@Param("repertoryid")int repertoryid);
	
}