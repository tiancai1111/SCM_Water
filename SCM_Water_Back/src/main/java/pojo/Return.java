package pojo;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Return {
    /**
     * 商品销售利润Id
     */
    private Integer returnid;

    /**
     * 单据日期
     */
    private Date returndate;

    /**
     * 应收金额
     */
    private Double returnmoney;

    /**
     * 优惠
     */
    private Double returndiscounts;

    /**
     * 利润
     */
    private Double returns;

    public Integer getReturnid() {
        return returnid;
    }

    public void setReturnid(Integer returnid) {
        this.returnid = returnid;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public Double getReturnmoney() {
        return returnmoney;
    }

    public void setReturnmoney(Double returnmoney) {
        this.returnmoney = returnmoney;
    }

    public Double getReturndiscounts() {
        return returndiscounts;
    }

    public void setReturndiscounts(Double returndiscounts) {
        this.returndiscounts = returndiscounts;
    }

    public Double getReturns() {
        return returns;
    }

    public void setReturns(Double returns) {
        this.returns = returns;
    }
}