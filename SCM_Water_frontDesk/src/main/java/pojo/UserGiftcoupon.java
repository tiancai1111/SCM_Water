package pojo;

/**
 * 用户和奖券的关联表
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
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