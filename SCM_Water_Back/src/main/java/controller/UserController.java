package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Staff;
import pojo.User;
import service.UserService;

@Controller
public class UserController {
	
	   @Autowired
	   private UserService userservice;
	   
	   //查看客户
	   @RequestMapping("customer")
	   public String show(@RequestParam(value="name",required=false)String name,
			   Model model) {
			List<User> list=userservice.UserAll(name);
			model.addAttribute("list",list);
			return "User_zf.html";
		   }
	   
	   //客户修改查看
	   @RequestMapping("UsertUpdate_zf.html")
	   public String  createUpdate(int userid,Model model) {
		   User sum = userservice.UserUpda(userid);
		   if(sum!=null) {
			   model.addAttribute("sum",sum);
			   return "UserUpdate_zf.html";
		   }
		   return null;
	   }
	   
	   //客户修改
	   @ResponseBody
	   @PostMapping("UserUp")
	   public int UserUp(User user) {
		   int sta = userservice.UserUp(user);
		   return sta;
	   }
	   
	   //客户删除
	   @ResponseBody
	   @PostMapping("userdelete.html")
	   public int userdelete(int userid) {
		int dele = userservice.createdelete(userid);
		return userid;
	   }
}
