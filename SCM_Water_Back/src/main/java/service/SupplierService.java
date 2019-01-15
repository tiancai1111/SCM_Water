package service;

import java.util.List;

import pojo.Supplier;
import pojo.User;

public interface SupplierService {

	//查看提供商
	List<Supplier> SupplierAll(String suppliername);

	//修改查询
	Supplier SupplierUpdataAll(int supplierid);

	//修改提供商
	int SupplierUp(Supplier supplier);

	//删除提供商
	int createdelete(int supplierid);
	
	//新增
	int SupplierInsertAll(Supplier supplier);

}