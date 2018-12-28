package mapper;

import pojo.Repertory;

public interface RepertoryMapper {
    int deleteByPrimaryKey(Integer repertoryid);

    int insert(Repertory record);

    int insertSelective(Repertory record);

    Repertory selectByPrimaryKey(Integer repertoryid);

    int updateByPrimaryKeySelective(Repertory record);

    int updateByPrimaryKey(Repertory record);
}