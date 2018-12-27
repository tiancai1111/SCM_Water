package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Staff {
    /**
     * 员工Id
     */
    private Integer staffid;

    /**
     * 员工姓名
     */
    private String staffname;

    /**
     * 员工电话
     */
    private String staffphone;

    /**
     * 员工性别
     */
    private String staffsex;

    /**
     * 员工地址
     */
    private String staffsite;

    /**
     * 员工身份证
     */
    private String staff;

    /**
     * 密码
     */
    private String password;

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStaffphone() {
        return staffphone;
    }

    public void setStaffphone(String staffphone) {
        this.staffphone = staffphone == null ? null : staffphone.trim();
    }

    public String getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(String staffsex) {
        this.staffsex = staffsex == null ? null : staffsex.trim();
    }

    public String getStaffsite() {
        return staffsite;
    }

    public void setStaffsite(String staffsite) {
        this.staffsite = staffsite == null ? null : staffsite.trim();
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff == null ? null : staff.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}