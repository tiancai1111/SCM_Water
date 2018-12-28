package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-28
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

    /**
     * 权限id
     */
    private Integer menuinfoid;

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

    public Integer getMenuinfoid() {
        return menuinfoid;
    }

    public void setMenuinfoid(Integer menuinfoid) {
        this.menuinfoid = menuinfoid;
    }
}