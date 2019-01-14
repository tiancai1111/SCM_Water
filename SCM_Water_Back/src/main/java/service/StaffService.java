package service;

import java.util.List;
import pojo.Staff;

public interface StaffService {
	List<Staff> staffAll(String staffname);

	int staffInsert(Staff staff);

	Staff staffUpdate(int staffid);

	int StaffUp(Staff staff);

	int createdelete(Staff staff);
}