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