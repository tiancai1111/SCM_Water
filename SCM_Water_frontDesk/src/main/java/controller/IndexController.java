package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.User;

@Controller
public class IndexController {
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
	   System.out.println(user.getPhone());
	return "register";	   
   }

}
