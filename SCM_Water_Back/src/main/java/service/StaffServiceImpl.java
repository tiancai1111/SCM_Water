package service;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import mapper.StaffMapper;
import pojo.Staff;
@Service
public class StaffServiceImpl implements StaffService{
	@Autowired
	private StaffMapper staffMapper;
	@Override
	public List<Staff> staffAll(String staffname) {
		return staffMapper.staffAll(staffname);
	}
	@Override
	public int staffInsert(Staff staff) {
		return staffMapper.insert(staff);
	}
	@Override
	public Staff staffUpdate(int staffid) {
		return staffMapper.staffUpdate(staffid);
	}
	@Override
	public int StaffUp(Staff staff) {
		return staffMapper.StaffUp(staff);
	}
	@Override
	public int createdelete(Staff staff) {
		return staffMapper.createdelete(staff);
	}
}