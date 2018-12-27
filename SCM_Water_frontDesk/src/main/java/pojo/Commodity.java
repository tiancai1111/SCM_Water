package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Commodity {
    /**
     * 商品Id
     */
    private Integer commodityid;

    /**
     * 商品名
     */
    private String commodityname;

    /**
     * 商品进价
     */
    private Double commodityenter;

    /**
     * 商品销售价
     */
    private Double commoditysale;

    /**
     * 商品成本价
     */
    private Double commoditycost;

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public Double getCommodityenter() {
        return commodityenter;
    }

    public void setCommodityenter(Double commodityenter) {
        this.commodityenter = commodityenter;
    }

    public Double getCommoditysale() {
        return commoditysale;
    }

    public void setCommoditysale(Double commoditysale) {
        this.commoditysale = commoditysale;
    }

    public Double getCommoditycost() {
        return commoditycost;
    }

    public void setCommoditycost(Double commoditycost) {
        this.commoditycost = commoditycost;
    }
}