package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-28
 */
public class Repertory {
    /**
     * 库存管理Id
     */
    private Integer repertoryid;

    /**
     * 商品Id
     */
    private Integer commodityid;

    /**
     * 库存数量
     */
    private Integer repertoryamount;

    /**
     * 空桶数量
     */
    private Integer repertoryemptybarrel;


   private String commodityname;
	
	public String getCommodityname() {
	return commodityname;
}

public void setCommodityname(String commodityname) {
	this.commodityname = commodityname;
}

	/**
     *  库存充裕状态
     */
    private String repertorystate;
    /**
     * 商品进价
     */
    private Double commodityenter;

    /**
     * 商品销售价
     */
    private Double commoditysale;
    /**
     * 桶装水图片
     */
    private String img;
    

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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getRepertoryid() {
        return repertoryid;
    }

    public void setRepertoryid(Integer repertoryid) {
        this.repertoryid = repertoryid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getRepertoryamount() {
        return repertoryamount;
    }

    public void setRepertoryamount(Integer repertoryamount) {
        this.repertoryamount = repertoryamount;
    }

    public Integer getRepertoryemptybarrel() {
        return repertoryemptybarrel;
    }

    public void setRepertoryemptybarrel(Integer repertoryemptybarrel) {
        this.repertoryemptybarrel = repertoryemptybarrel;
    }

    public String getRepertorystate() {
        return repertorystate;
    }

    public void setRepertorystate(String repertorystate) {
        this.repertorystate = repertorystate == null ? null : repertorystate.trim();
    }
}