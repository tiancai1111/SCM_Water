package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Staffroleinfo {
    /**
     * 员工角色Id
     */
    private Integer userroleid;

    /**
     * 员工Id
     */
    private Integer staffid;

    /**
     * 角色Id
     */
    private Integer roleid;

    public Integer getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Integer userroleid) {
        this.userroleid = userroleid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}