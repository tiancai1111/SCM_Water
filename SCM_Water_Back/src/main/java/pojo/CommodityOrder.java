package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-28
 */
public class CommodityOrder {
    /**
     * Id
     */
    private Integer id;

    /**
     * 商品Id
     */
    private Integer commodityid;

    /**
     * 订单Id
     */
    private Integer orderid;

    /**
     * 数量
     */
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}