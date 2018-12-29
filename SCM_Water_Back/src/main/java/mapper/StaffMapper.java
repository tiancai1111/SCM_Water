package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Staff;

public interface StaffMapper {

	Staff Selects(@Param("staffname")String staffname);

    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffid);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

    //c
	List<Staff> SeleName(String string);
}