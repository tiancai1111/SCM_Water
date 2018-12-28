package shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.beans.factory.annotation.Autowired;

import mapper.StaffMapper;
import pojo.Staff;

/**
 * 自定义类
 * */
public class UserRealm extends AuthorizingRealm{

	@Autowired
    private StaffMapper staffMapper;
	/******
	 *** 授权逻辑
	 * *******/
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		System.out.println("执行授权逻辑");
		return null;
	}

	
	/******
	 *** 认证逻辑
	 * *******/
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken Token = (UsernamePasswordToken) token;
		String staffname;
		Staff staff;
		try {
			
			staffname = Token.getUsername();
			staff = staffMapper.Selects(staffname);
			if(staff==null) {
				return null;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
		
	}


}
