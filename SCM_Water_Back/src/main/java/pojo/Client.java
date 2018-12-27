package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Client {
    /**
     * 客户信息Id
     */
    private Integer clientid;

    /**
     * 客户订单Id
     */
    private Integer goodsid;

    /**
     * 客户名称
     */
    private String clientname;

    /**
     * 客户地区
     */
    private String clientregion;

    /**
     * 客户电话
     */
    private String clientphone;

    /**
     * 客户欠款
     */
    private Double clientdebt;

    /**
     * 客户订单数
     */
    private Integer clientquantity;

    /**
     * 客户订单总金额
     */
    private Double clienttotalmoney;

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getClientregion() {
        return clientregion;
    }

    public void setClientregion(String clientregion) {
        this.clientregion = clientregion == null ? null : clientregion.trim();
    }

    public String getClientphone() {
        return clientphone;
    }

    public void setClientphone(String clientphone) {
        this.clientphone = clientphone == null ? null : clientphone.trim();
    }

    public Double getClientdebt() {
        return clientdebt;
    }

    public void setClientdebt(Double clientdebt) {
        this.clientdebt = clientdebt;
    }

    public Integer getClientquantity() {
        return clientquantity;
    }

    public void setClientquantity(Integer clientquantity) {
        this.clientquantity = clientquantity;
    }

    public Double getClienttotalmoney() {
        return clienttotalmoney;
    }

    public void setClienttotalmoney(Double clienttotalmoney) {
        this.clienttotalmoney = clienttotalmoney;
    }
}