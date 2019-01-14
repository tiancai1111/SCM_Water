package shiro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
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
		return null;
/*		// TODO Auto-generated method stub
		System.out.println("执行授权逻辑");
		Object principal = principals.getPrimaryPrincipal();
		List<Staff> user_roles = adminMapper.SeleName(principal.toString());
		Set<String> roles = new HashSet<String>();
		for (int i = 0; i < user_roles.size(); i++) {
			roles.add(user_roles.get(i).getPermissionsName());
		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
		return info;*/
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
			char[] apw = Token.getPassword();
			if(apw!=null) {
				String realmName  = getName();
				SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(staff,staff.getPassword(),realmName);
				return info;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
