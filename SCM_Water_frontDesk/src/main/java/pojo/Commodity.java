package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-28
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
    /**
     * 桶装水图片
     */
    private String img;
    private String state;
    /**
     * 桶装水销售数量
     */
    private int commodityQuantity;
    
    public int getCommodityQuantity() {
		return commodityQuantity;
	}

	public void setCommodityQuantity(int commodityQuantity) {
		this.commodityQuantity = commodityQuantity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}