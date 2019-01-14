package pojo;

/**
 * 用户和奖券的关联表
 * 
 * @author wcyong
 * 
 * @date 2018-12-28
 */
public class UserGiftcoupon {
	/**
	 * 编号
	 */
	private Integer id;

	/**
	 * 用户表外键
	 */
	private Integer uid;

	/**
	 * 奖券表外键
	 */
	private Integer gcid;

	private String gc_name;
	private Float gc_money;


	public String getGc_name() {
		return gc_name;
	}

	public void setGc_name(String gc_name) {
		this.gc_name = gc_name;
	}

	public Float getGc_money() {
		return gc_money;
	}

	public void setGc_money(Float gc_money) {
		this.gc_money = gc_money;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getGcid() {
		return gcid;
	}

	public void setGcid(Integer gcid) {
		this.gcid = gcid;
	}
}