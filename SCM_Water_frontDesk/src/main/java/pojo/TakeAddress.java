package pojo;

/**
 * 收货地址
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class TakeAddress {
    /**
     * 编号
     */
    private Integer taId;

    /**
     * 地址
     */
    private String address;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 用户外键
     */
    private Integer userId;

    /**
     * 姓名
     */
    private String name;

    public Integer getTaId() {
        return taId;
    }

    public void setTaId(Integer taId) {
        this.taId = taId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}