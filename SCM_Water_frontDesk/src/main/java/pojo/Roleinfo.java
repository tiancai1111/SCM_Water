package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Roleinfo {
    /**
     * 角色Id
     */
    private Integer roleid;

    /**
     * 角色名
     */
    private String rolename;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }
}