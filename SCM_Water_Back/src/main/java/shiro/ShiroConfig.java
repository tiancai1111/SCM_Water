package shiro;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Shiro的配置类
 * ***/
@Configuration
public class ShiroConfig {
    /**
     ***创建ShiroFilterFactoryBean
     * ***********/
	@Bean
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultWebSecurityManager defaultWebSecurityManager ) {
	     /* 
	     *//*******
		 * **anon:无需认证就可以访问
		 * **authc:必须认证才能访问
		 * **user:如果使用了rememberme的功能可以直接访问
		 * **perms:该资源必须得到资源权限才可以访问
		 * **roles:该资源必须得到角色权限才可以访问
		 * ******//*
		 * */		
		    ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
	        // 必须设置 SecurityManager
	        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
	        // 设置拦截器
	        Map<String, String> filterChainDefinitionMap = new HashMap<String, String>();
	        
	        //验证失败的跳转页面(authc)
	        shiroFilterFactoryBean.setLoginUrl("/failure");
	        
	        
	        filterChainDefinitionMap.put("/member.html", "anon");
	        filterChainDefinitionMap.put("/show.html", "anon");
	        filterChainDefinitionMap.put("/index", "anon");
	        filterChainDefinitionMap.put("/login", "anon");
	        filterChainDefinitionMap.put("/loginpresent", "anon");
	        filterChainDefinitionMap.put("/static/**", "anon");
	        
	        
	        filterChainDefinitionMap.put("/show.html", "roles[admin]");
	        filterChainDefinitionMap.put("/customer", "roles[admin]");
	        filterChainDefinitionMap.put("/supper.html", "roles[admin]");
	        filterChainDefinitionMap.put("/order", "roles[admin]");
	        filterChainDefinitionMap.put("/delivery", "roles[admin]");
	        filterChainDefinitionMap.put("/orderAlready", "roles[admin]");
	        
	        
	        //设置未授权的页面
	        shiroFilterFactoryBean.setUnauthorizedUrl("/unAuth");
	        
	        
	        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
	        
	        return shiroFilterFactoryBean;
	}
	
    /**
     ***创建DefaultWebSecurityManager
     * ***********/
	@Bean(name="securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(userRealm);
		return securityManager;
	}
	
    /**
     ***创建Reaml
     * ***********/
	@Bean(name="userRealm")
	public UserRealm getReaml() {
		return new UserRealm();
		
	}
}
