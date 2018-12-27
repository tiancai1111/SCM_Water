package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class User {
    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 用户名
     */
    private String name;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像
     */
    private String portrait;

    /**
     * 地址
     */
    private String address;

    /**
     * 积分
     */
    private Integer integrate;

    /**
     * 余额
     */
    private Integer money;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getIntegrate() {
        return integrate;
    }

    public void setIntegrate(Integer integrate) {
        this.integrate = integrate;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}