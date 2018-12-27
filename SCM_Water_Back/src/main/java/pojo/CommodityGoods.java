package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class CommodityGoods {
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
    private Integer goodsid;

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

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }
}