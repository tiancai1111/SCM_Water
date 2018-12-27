package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Rolemenu {
    /**
     * 角色菜单Id
     */
    private Integer rolemenuid;

    /**
     * 角色Id
     */
    private Integer roleid;

    /**
     * 菜单Id
     */
    private Integer menuid;

    public Integer getRolemenuid() {
        return rolemenuid;
    }

    public void setRolemenuid(Integer rolemenuid) {
        this.rolemenuid = rolemenuid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }
}