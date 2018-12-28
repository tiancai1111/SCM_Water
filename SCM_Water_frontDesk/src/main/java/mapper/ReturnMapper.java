package mapper;

import pojo.Return;

public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnid);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnid);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);
}