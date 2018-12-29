package mapper;

import org.apache.ibatis.annotations.Select;

import pojo.User;

public interface UserMapper {
	@Select("select count(1) from user where name=#{name}")
    int selectByName(User user);
    
	    
}