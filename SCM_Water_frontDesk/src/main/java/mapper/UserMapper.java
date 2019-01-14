package mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import pojo.User;

public interface UserMapper {
	@Select("select count(1) from user where phone=#{phone}")
    int selectByPhone(User user);

       	
	int addUser(User user);
	@Select("select count(1) from user where phone=#{phone} and password=#{password}")
	int login(User user);
	@Select("select * from user where phone=#{phone}")
	User findByUser(User user);
	@Select("select * from user where userid=#{id}")
	User selectUser(int id);

    @Update("UPDATE `scm_water`.`user` SET `integrate` =#{integrate} WHERE `userid` =#{userid};")
	void updateUserIntegrate(@Param("integrate")Integer integrate,@Param("userid") int userid);
	
}