package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mapper.UserMapper;
import pojo.User;

@Controller
public class IndexController {
	@Resource
	private UserMapper userMapper;
   @RequestMapping("hhhh")
   public String hhhh() {
	return "login";	   
   }
   @RequestMapping("gggg")
   public String gggg() {
	return "register";	   
   }
   @ResponseBody
   @PostMapping("qqqq")
   public String qqqq(User user) {
	   user.setName("张三");
	   System.out.println(user.getPhone());
	return "register";	   
   }

}
