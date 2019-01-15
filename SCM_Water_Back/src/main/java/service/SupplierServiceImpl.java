package service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import mapper.ClientMapper;
import mapper.StaffMapper;
import mapper.SupplierMapper;
import mapper.UserMapper;
import pojo.Staff;
import pojo.Supplier;
import pojo.User;
@Service
public class SupplierServiceImpl implements SupplierService{
	@Autowired
	private  SupplierMapper suppliermapper;

	@Override
	public List<Supplier> SupplierAll(String suppliername) {
		return suppliermapper.SupplierAll(suppliername);
	}

	@Override
	public Supplier SupplierUpdataAll(int supplierid) {
		return suppliermapper.SupplierUpdataAll(supplierid);
	}

	@Override
	public int SupplierUp(Supplier supplier) {
		return suppliermapper.SupplierUp(supplier);
	}

	@Override
	public int createdelete(int supplierid) {
		return suppliermapper.createdelete(supplierid);
	}

	@Override
	public int SupplierInsertAll(Supplier supplier) {
		return suppliermapper.SupplierInsertAll(supplier);
	}

	
}