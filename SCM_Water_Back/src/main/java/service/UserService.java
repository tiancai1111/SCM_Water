package service;

import java.util.List;
import pojo.User;

public interface UserService {
	//查询客户
	List<User> UserAll(String name);

	//客户修改查询
	User UserUpda(int userid);

	//修改客户
	int UserUp(User user);

	//客户删除
	int createdelete(int userid);
	
}