package service;

import pojo.User;

public interface UserService {
	int selectByPhone(User user);
	int updateUser(User user);
	User findByUser();
	void addUser(User user);
	
	
}
