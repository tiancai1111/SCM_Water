package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import pojo.Staff;

public interface StaffMapper {
    //根据用户名查看（登陆）
	Staff Selects(@Param("staffname")String staffname);

    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer staffid);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

    //
	List<Staff> SeleName(String string);

	//查询管理员信息
	List<Staff> staffAll(@Param(value="staffname")String staffname);
	//新增管理员
	int staffInsert(Staff staff);
	//员工修改查询
	Staff staffUpdate(int staffid);                                                       
	//员工修改
	int StaffUp(Staff staff);
	//员工删除
	@Delete("DELETE FROM `scm_water`.`staff` WHERE `staffid` = #{staffid}")
	int createdelete(Staff staff);
}