package pojo;

/**
 * 购物车表 购物车表
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Shopping extends ShoppingKey {
    /**
     * 关联编号
     */
    private Integer commodityId;

    private String count;

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
}