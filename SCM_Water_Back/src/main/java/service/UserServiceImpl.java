package service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import mapper.ClientMapper;
import mapper.StaffMapper;
import mapper.UserMapper;
import pojo.Staff;
import pojo.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private  UserMapper usermapper;
	
	@Override
	public List<User> UserAll(String name) {
		return usermapper.UserAll(name);
	}

	@Override
	public User UserUpda(int userid) {
		return usermapper.UserUpda(userid);
	}

	@Override
	public int UserUp(User user) {
		return usermapper.UserUp(user);
	}

	@Override
	public int createdelete(int userid) {
		return usermapper.createdelete(userid);
	}
	
	
}