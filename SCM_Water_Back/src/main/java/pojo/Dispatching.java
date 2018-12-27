package pojo;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Dispatching {
    /**
     * 派工处理Id
     */
    private Integer dispatchingid;

    /**
     * 订单号
     */
    private String dispatchingmark;

    /**
     * 订货时间
     */
    private Date dispatchingordertime;

    /**
     * 应收金额
     */
    private Double dispatchingmoney;

    /**
     * 地区
     */
    private String dispatchingregion;

    /**
     * 地址
     */
    private String dispatchingsite;

    public Integer getDispatchingid() {
        return dispatchingid;
    }

    public void setDispatchingid(Integer dispatchingid) {
        this.dispatchingid = dispatchingid;
    }

    public String getDispatchingmark() {
        return dispatchingmark;
    }

    public void setDispatchingmark(String dispatchingmark) {
        this.dispatchingmark = dispatchingmark == null ? null : dispatchingmark.trim();
    }

    public Date getDispatchingordertime() {
        return dispatchingordertime;
    }

    public void setDispatchingordertime(Date dispatchingordertime) {
        this.dispatchingordertime = dispatchingordertime;
    }

    public Double getDispatchingmoney() {
        return dispatchingmoney;
    }

    public void setDispatchingmoney(Double dispatchingmoney) {
        this.dispatchingmoney = dispatchingmoney;
    }

    public String getDispatchingregion() {
        return dispatchingregion;
    }

    public void setDispatchingregion(String dispatchingregion) {
        this.dispatchingregion = dispatchingregion == null ? null : dispatchingregion.trim();
    }

    public String getDispatchingsite() {
        return dispatchingsite;
    }

    public void setDispatchingsite(String dispatchingsite) {
        this.dispatchingsite = dispatchingsite == null ? null : dispatchingsite.trim();
    }
}