package service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mapper.UserMapper;
import pojo.User;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
	@Override
	public int selectByPhone(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectByPhone(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}

	@Override
	public User findByUser(User user) {
		// TODO Auto-generated method stub
		int num=userMapper.login(user);
		if(num!=0) {
			return userMapper.findByUser(user);
		}else {
			user.setUserid(0);
			return user;
		}
		
		
	}

	@Override
	public User selectUser(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectUser(id);
	}

}
