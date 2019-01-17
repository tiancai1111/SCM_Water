package controller;
import java.util.List;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Staff;
import service.StaffService;

@Controller
public class IndexController {
	
   @Autowired
   private StaffService staffService;
	
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
   @RequestMapping("failure")
   public String failure() {
	return "failure";
   }

   @RequestMapping("head")
   public String head() {
		return "redirect:show.html";
   }
   
   
   //登录提交跳转地址
   @ResponseBody
   @PostMapping("loginpresent")
   public String loginpresent(String staffname,String password) {
	  /* //*****
	    * **使用Shiro编写认证操作
	    * ****/
	//1..获取Subject
	Subject subject = SecurityUtils.getSubject();
	//2.封装用户数据
	UsernamePasswordToken token =new UsernamePasswordToken(staffname,password);   
	//3.执行登陆方法
	try {
		//登陆成功!
		subject.login(token);
		System.out.println("成功");
		return "index";
	} catch (UnknownAccountException e) {
		//用户不存在
		System.out.println("用户名不存在");
	} catch (IncorrectCredentialsException e) {
		//密码错误
		System.out.println("密码错误");
	}
	return "admin";
   }
   
   //跳转到主页面
   @RequestMapping("show.html")
   public String show(@RequestParam(value="staffname",required=false)String staffname
		   ,Model model) {
	List<Staff> list=staffService.staffAll(staffname);
	model.addAttribute("list",list);
	return "member_zf";
   }
   
   //跳转到员工新增
   @RequestMapping("create_zf.html")
   public String create() {
	return "create_zf";
   }
   
   //管理员新增
   @ResponseBody
   @RequestMapping("StaffInsert")
   public int StaffInsert(Staff staff) {
    int sta = staffService.staffInsert(staff);
	return sta;
   }
   
   //员工修改查询页面
   @RequestMapping("createUpdate_zf.html")
   public String  createUpdate(int staffid,Model model) {
	   Staff sum = staffService.staffUpdate(staffid);
	   System.out.println(staffid);
	   if(sum!=null) {
		   model.addAttribute("sum",sum);
		   return "createUpdate_zf.html";
	   }
	   return null;
   }
   
   //员工修改页面
   @ResponseBody
   @RequestMapping("StaffUpdate")
   public int StaffUpdate(Staff staff) {
    int sta = staffService.StaffUp(staff);
	return sta;
   }
   
   //员工删除
   @ResponseBody
   @PostMapping("/createdelete.html")
   public int createdelete(Staff staff) {
   int dele = staffService.createdelete(staff);
    	return dele;
   }
}