package pojo;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-28
 */
public class Delivery {
    /**
     * 派送Id
     */
    private Integer deliveryid;

    /**
     * 派送时间
     */
    private Date deliverytime;

    /**
     * 配送员
     */
    private String deliveryman;

    /**
     * 应收空桶
     */
    private Integer emptybarrel;

    /**
     * 订单id
     */
    private Integer orderId;

    public Integer getDeliveryid() {
        return deliveryid;
    }

    public void setDeliveryid(Integer deliveryid) {
        this.deliveryid = deliveryid;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getDeliveryman() {
        return deliveryman;
    }

    public void setDeliveryman(String deliveryman) {
        this.deliveryman = deliveryman == null ? null : deliveryman.trim();
    }

    public Integer getEmptybarrel() {
        return emptybarrel;
    }

    public void setEmptybarrel(Integer emptybarrel) {
        this.emptybarrel = emptybarrel;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}