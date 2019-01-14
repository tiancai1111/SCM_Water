package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    
    //查询客户
    /* @Select("SELECT * FROM `user` where 1=1 and name like CONCAT('%',#{name},'%')")*/
    List<User> UserAll(@Param("name")String name);
    
    //客户修改查询
    /*@Update("UPDATE `user`SET `name` = #{name},`phone` = #{phone},`password` = #{password},`email` = #{email},`address` = address,`integrate` = integrate,`money` = money WHERE `userid` = #{userid}")*/
   @Select("Select * from user where `userid` = #{userid}")
    User UserUpda(int userid);
   
   //客户修改
   @Update("UPDATE `user`SET `name` = #{name},`phone` = #{phone},`password` = #{password},`email` = #{email},`address` = #{address},`integrate` = #{integrate},`money` = #{money} WHERE `userid` = #{userid}")
   int UserUp(User user);
   
   //客户删除
   @Delete("DELETE FROM `user` WHERE `userid` = #{userid}")
   int createdelete(int userid);
}