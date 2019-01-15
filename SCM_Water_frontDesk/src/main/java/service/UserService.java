package service;

import pojo.User;

public interface UserService {
	/**
	 * 查询电话号是否已注册
	 * @param user
	 * @return 数量
	 */
    int selectByPhone(User user);
    /**
	 * 修改用户
	 * @param user
	 * @return 数量
	 */
	int updateUser(User user); 
	/**
	 * 添加用户
	 * @param user
	 * @return 数量
	 */
	int addUser(User user);
	/**
	 * 
	 * 查询个人信息
	 * @param user
	 * @return User
	 */
	User findByUser(User user);
	/**
	 * 
	 * 根据userid查询个人信息
	 * @param user
	 * @return User
	 */
	User selectUser(int id);
	
}
