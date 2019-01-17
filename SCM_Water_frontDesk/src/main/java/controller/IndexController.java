package controller;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import pojo.User;
import service.UserService;

@Controller
public class IndexController {
	@Resource
	private UserService userService;
   @RequestMapping("goLogin")
   public String goLogin() {
	return "login";	   
   }
   @RequestMapping("goRegister")
   public String goRegister() {
	return "register";	   
   }
   @GetMapping("goMy")
   public String goMy(Model model,HttpServletRequest request) {
	   int userId=(int)request.getSession().getAttribute("userid") ;
	   User user=userService.selectUser(userId);
	   model.addAttribute("user",user);
	return "my";	   
   }
   @GetMapping("goPersonal_information")
   public String goPersonal_information() {
	   return "Personal_information";
   }
   @ResponseBody
   @PostMapping("findByPhone")
   public String findByPhone(User user) {
	   int num=userService.selectByPhone(user);
	   System.out.println(num);
	   System.out.println(user.getPhone());
	   String json=JSON.toJSONString(num);
	return json;	   
   }
   @ResponseBody
   @PostMapping("updateUser")
   public String updateUser(User user) {
	   int num=userService.updateUser(user);
	   String json=JSON.toJSONString(num);
	return json;
   }
   @PostMapping("login")
   public String login(HttpSession session,User user) {
	   User users=userService.findByUser(user);	  
	   if(users.getUserid()!=0) {
		   System.out.println(users.getName());
		   session.setAttribute("userid",users.getUserid());
		   return "redirect:home";	
		 
	   }	  
	   return "redirect:gologin";
   }
   @ResponseBody
   @PostMapping("findByUser")
   public User findByUser(Model model,User user) {
	   User users=userService.findByUser(user);
	   System.out.println(users);
	return users;	   
   }
  
}
