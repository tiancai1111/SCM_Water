package pojo;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Chargeback {
    /**
     * 退货原因Id
     */
    private Integer chargebackid;

    /**
     * 订单Id
     */
    private Integer chargebackorder;

    /**
     * 退单申请日期
     */
    private Date chargebackapplyfordate;

    /**
     *  退单原因阐述
     */
    private String chargebackcause;

    /**
     * 退单数量
     */
    private Integer chargebackquantity;

    /**
     * 退单审批
     */
    private String chargebackapprove;

    /**
     * 退单时间
     */
    private Date chargebackdate;

    /**
     * 退单金额
     */
    private Double chargebackmoney;

    /**
     *  操作人员姓名
     */
    private String chargebackoperationname;

    public Integer getChargebackid() {
        return chargebackid;
    }

    public void setChargebackid(Integer chargebackid) {
        this.chargebackid = chargebackid;
    }

    public Integer getChargebackorder() {
        return chargebackorder;
    }

    public void setChargebackorder(Integer chargebackorder) {
        this.chargebackorder = chargebackorder;
    }

    public Date getChargebackapplyfordate() {
        return chargebackapplyfordate;
    }

    public void setChargebackapplyfordate(Date chargebackapplyfordate) {
        this.chargebackapplyfordate = chargebackapplyfordate;
    }

    public String getChargebackcause() {
        return chargebackcause;
    }

    public void setChargebackcause(String chargebackcause) {
        this.chargebackcause = chargebackcause == null ? null : chargebackcause.trim();
    }

    public Integer getChargebackquantity() {
        return chargebackquantity;
    }

    public void setChargebackquantity(Integer chargebackquantity) {
        this.chargebackquantity = chargebackquantity;
    }

    public String getChargebackapprove() {
        return chargebackapprove;
    }

    public void setChargebackapprove(String chargebackapprove) {
        this.chargebackapprove = chargebackapprove == null ? null : chargebackapprove.trim();
    }

    public Date getChargebackdate() {
        return chargebackdate;
    }

    public void setChargebackdate(Date chargebackdate) {
        this.chargebackdate = chargebackdate;
    }

    public Double getChargebackmoney() {
        return chargebackmoney;
    }

    public void setChargebackmoney(Double chargebackmoney) {
        this.chargebackmoney = chargebackmoney;
    }

    public String getChargebackoperationname() {
        return chargebackoperationname;
    }

    public void setChargebackoperationname(String chargebackoperationname) {
        this.chargebackoperationname = chargebackoperationname == null ? null : chargebackoperationname.trim();
    }
}