package pojo;

/**
 * 购物劵表 购物劵表
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Giftcoupon {
    /**
     * 奖券id
     */
    private Integer gcId;

    /**
     * 奖券名称
     */
    private String gcName;

    /**
     * 奖券抵扣金额
     */
    private String gcMoney;

    /**
     * 奖券所需积分
     */
    private String gcRequired;

    public Integer getGcId() {
        return gcId;
    }

    public void setGcId(Integer gcId) {
        this.gcId = gcId;
    }

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName == null ? null : gcName.trim();
    }

    public String getGcMoney() {
        return gcMoney;
    }

    public void setGcMoney(String gcMoney) {
        this.gcMoney = gcMoney == null ? null : gcMoney.trim();
    }

    public String getGcRequired() {
        return gcRequired;
    }

    public void setGcRequired(String gcRequired) {
        this.gcRequired = gcRequired == null ? null : gcRequired.trim();
    }
}