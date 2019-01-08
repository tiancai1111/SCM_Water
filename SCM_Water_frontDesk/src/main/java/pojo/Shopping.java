package pojo;

/**
 * 购物车表 购物车表
 * 
 * @author wcyong
 * 
 * @date 2018-12-28
 */
public class Shopping {
	/**
	 * 编号
	 */
	private Integer id;

	/**
	 * 关联编号
	 */
	private Integer commodityId;

	private String count;

	private Integer userId;
	private float money;
	private String commodityName;
	private float commoditySale;
	private String img;
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public float getCommoditySale() {
		return commoditySale;
	}

	public void setCommoditySale(float commoditySale) {
		this.commoditySale = commoditySale;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count == null ? null : count.trim();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}