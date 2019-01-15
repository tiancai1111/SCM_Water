package pojo;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-28
 */
public class Order {
    /**
     * id
     */
    private Integer id;

    /**
     * 订单编号
     */
    private String numberr;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 地址
     */
    private String address;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 下单时间
     */
    private Date ordertime;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 订单总金额
     */
    
    private String name;
    private String state;
    
    
    public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	private String commodityname;
    private int commoditysale;
    private int count;
    
    private Date deliverytime;
    private String deliveryman;
    

    
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
		this.deliveryman = deliveryman;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getCommodityname() {
		return commodityname;
	}

	public void setCommodityname(String commodityname) {
		this.commodityname = commodityname;
	}

	public int getCommoditysale() {
		return commoditysale;
	}

	public void setCommoditysale(int commoditysale) {
		this.commoditysale = commoditysale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumberr() {
        return numberr;
    }

    public void setNumberr(String numberr) {
        this.numberr = numberr == null ? null : numberr.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}