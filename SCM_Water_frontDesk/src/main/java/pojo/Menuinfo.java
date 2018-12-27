package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Menuinfo {
    /**
     * 菜单Id
     */
    private Integer menuid;

    /**
     * 菜单名
     */
    private String menuname;

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }
}