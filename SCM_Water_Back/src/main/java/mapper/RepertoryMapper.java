package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Repertory;

public interface RepertoryMapper {
	List<Repertory> list();
	List<Repertory> repertory(@Param("commodityName")String commodityName);
	Repertory repertoryDetails(@Param("repertoryid")int repertoryid);
	int repertoryDel(@Param("repertoryid") int repertoryid);
	Repertory repertorys(@Param("repertoryid")int repertoryid);
	int repertoryUpdate(@Param("repertoryid")int repertoryid,@Param("repertorystate")String repertorystate);
	int repertoryInsert(Repertory repertory);
	int repertoryStock(@Param("commodityid")int commodityid,@Param("repertoryamount")int repertoryamount);
	int repertoryss(@Param("commodityId")int commodityId);
	
}