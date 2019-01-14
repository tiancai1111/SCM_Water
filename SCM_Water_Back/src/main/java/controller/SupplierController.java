package controller;

import java.util.List;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Staff;
import pojo.Supplier;
import pojo.User;
import service.SupplierService;
import service.UserService;

@Controller
public class SupplierController {
	
	@Autowired SupplierService supplierservice;
	
	@RequestMapping("supper.html")
	public String supperAll(@RequestParam(value="suppliername",required=false)
	String suppliername,Model model) {
		List<Supplier> sum = supplierservice.SupplierAll(suppliername);
		   if(sum!=null) {
			   model.addAttribute("sum",sum);
			   return "supplier_zf.html";
		   }
		   return null;
	}
	
	   //提供商修改查看
	   @RequestMapping("supplieridUpdate_zf")
	   public String  createUpdate(int supplierid,Model model) {
		   System.out.println(supplierid);
		   Supplier sum = supplierservice.SupplierUpdataAll(supplierid);
		   if(sum!=null) {
			   model.addAttribute("sum",sum);
			   return "supplierUpdate_zf.html";
		   }
		   return null;
	   }
	   
	   //修改提供商
	   @ResponseBody
	   @PostMapping("SupplierUpdate")
	   public int SupplierUpdate(Supplier supplier) {
		   int sta = supplierservice.SupplierUp(supplier);
		   return sta;
		   }
	   
	   

       //删除提供商
	   @ResponseBody
       @PostMapping("supplierdata")
       public int supplierdata(int supplierid) {
    	int dele = supplierservice.createdelete(supplierid);
   		return dele;
       }
	   
	  
	   @RequestMapping("SupplierInsert")
	   public String StaffInsert() {
		return "SupplierInsert.html";
	   }
	   
	   @ResponseBody
       @PostMapping("supplierAll")
       public int  supplierAll(Supplier supplier) {
    	int dele = supplierservice.SupplierInsertAll(supplier);
   		return dele;
       }
}

       
       
