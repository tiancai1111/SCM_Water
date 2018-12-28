package mapper;

import pojo.Staffroleinfo;

public interface StaffroleinfoMapper {
    int deleteByPrimaryKey(Integer userroleid);

    int insert(Staffroleinfo record);

    int insertSelective(Staffroleinfo record);

    Staffroleinfo selectByPrimaryKey(Integer userroleid);

    int updateByPrimaryKeySelective(Staffroleinfo record);

    int updateByPrimaryKey(Staffroleinfo record);
}