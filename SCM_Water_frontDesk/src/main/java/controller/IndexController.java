package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import mapper.UserMapper;
import pojo.User;

@Controller
public class IndexController {
	@Resource
	private UserMapper userMapper;
   @RequestMapping("goLogin")
   public String goLogin() {
	return "login";	   
   }
   @RequestMapping("goRegister")
   public String goRegister() {
	return "register";	   
   }
   @ResponseBody
   @PostMapping("findByPhone")
   public String findByPhone(User user) {
	   int num=userMapper.selectByPhone(user);
	   System.out.println(num);
	   System.out.println(user.getPhone());
	   String json=JSON.toJSONString(num);
	return json;	   
   }
   @ResponseBody
   @PostMapping("updateUser")
   public String updateUser(User user) {
	   int num=userMapper.updateUser(user);
	   String json=JSON.toJSONString(num);
	return json;	   
   }

}
