package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
   @RequestMapping("hhhh")
   public String hhhh() {
	return "index";
	   
   }
}
