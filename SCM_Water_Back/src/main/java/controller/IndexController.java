package controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
   @RequestMapping("index")
   public String index() {
	return "index";
   }
   @RequestMapping("login")
   public String login() {
	return "login";
   }
   @RequestMapping("admin")
   public String admin() {
	return "admin";
   }
   @RequestMapping("tes")
   public String test() {
	return "test";
   }
   @RequestMapping("failure")
   public String failure() {
	return "failure";
   }
   
   
   
   
   
   //登录提交跳转地址
   @ResponseBody
   @RequestMapping("loginpresent")
   public String loginpresent(String staffname,String password,Model model) {
	   /**//*****
	    * **使用Shiro编写认证操作
	    * ****//*
*/	   
	//1..获取Subject
	Subject subject = SecurityUtils.getSubject();
	
	//2.封装用户数据
	UsernamePasswordToken token =new UsernamePasswordToken(staffname,password);   
	
	//3.执行登陆方法
	try {
		//登陆成功!
		subject.login(token);
		return "redirect:/index";
	} catch (UnknownAccountException e) {
		//用户不存在
		model.addAttribute("model","用户名不存在");
		return "login";
	} catch (IncorrectCredentialsException e) {
		//密码错误
		model.addAttribute("model","用户名不存在");
		return "login";
	}
   }
}
