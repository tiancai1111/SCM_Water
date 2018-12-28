package mapper;

import pojo.Staff;

public interface StaffMapper {

	Staff Selects(String staffname);

    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffid);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}