package pojo;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Goods {
    /**
     * 客户订单Id
     */
    private Integer goodsid;

    /**
     * 订单号
     */
    private Integer goodsmark;

    /**
     * 订单时间
     */
    private Date goodsdate;

    /**
     * 派送时间
     */
    private Date goodsdeliverytime;

    /**
     * 配送状态
     */
    private String goodsstate;

    /**
     * 配送员
     */
    private String goodsdeliveryman;

    /**
     * 订单数
     */
    private Integer goodsquantity;

    /**
     * 订单总金额
     */
    private Double goodstotalmoney;

    /**
     * 应收空桶
     */
    private Integer goodsemptybarrel;

    /**
     * 签单状态
     */
    private String goodssignfor;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsmark() {
        return goodsmark;
    }

    public void setGoodsmark(Integer goodsmark) {
        this.goodsmark = goodsmark;
    }

    public Date getGoodsdate() {
        return goodsdate;
    }

    public void setGoodsdate(Date goodsdate) {
        this.goodsdate = goodsdate;
    }

    public Date getGoodsdeliverytime() {
        return goodsdeliverytime;
    }

    public void setGoodsdeliverytime(Date goodsdeliverytime) {
        this.goodsdeliverytime = goodsdeliverytime;
    }

    public String getGoodsstate() {
        return goodsstate;
    }

    public void setGoodsstate(String goodsstate) {
        this.goodsstate = goodsstate == null ? null : goodsstate.trim();
    }

    public String getGoodsdeliveryman() {
        return goodsdeliveryman;
    }

    public void setGoodsdeliveryman(String goodsdeliveryman) {
        this.goodsdeliveryman = goodsdeliveryman == null ? null : goodsdeliveryman.trim();
    }

    public Integer getGoodsquantity() {
        return goodsquantity;
    }

    public void setGoodsquantity(Integer goodsquantity) {
        this.goodsquantity = goodsquantity;
    }

    public Double getGoodstotalmoney() {
        return goodstotalmoney;
    }

    public void setGoodstotalmoney(Double goodstotalmoney) {
        this.goodstotalmoney = goodstotalmoney;
    }

    public Integer getGoodsemptybarrel() {
        return goodsemptybarrel;
    }

    public void setGoodsemptybarrel(Integer goodsemptybarrel) {
        this.goodsemptybarrel = goodsemptybarrel;
    }

    public String getGoodssignfor() {
        return goodssignfor;
    }

    public void setGoodssignfor(String goodssignfor) {
        this.goodssignfor = goodssignfor == null ? null : goodssignfor.trim();
    }
}