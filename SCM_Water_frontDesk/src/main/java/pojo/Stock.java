package pojo;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Stock {
    /**
     * 进货Id
     */
    private Integer stockid;

    /**
     * 进货单号
     */
    private Integer stocknumbers;

    /**
     * 总金额
     */
    private Double stocktotalmoney;

    /**
     * 总数量
     */
    private Integer stocktotalquantity;

    /**
     * 进货时间
     */
    private Date stocktime;

    /**
     * 进货名称
     */
    private String stockname;

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Integer getStocknumbers() {
        return stocknumbers;
    }

    public void setStocknumbers(Integer stocknumbers) {
        this.stocknumbers = stocknumbers;
    }

    public Double getStocktotalmoney() {
        return stocktotalmoney;
    }

    public void setStocktotalmoney(Double stocktotalmoney) {
        this.stocktotalmoney = stocktotalmoney;
    }

    public Integer getStocktotalquantity() {
        return stocktotalquantity;
    }

    public void setStocktotalquantity(Integer stocktotalquantity) {
        this.stocktotalquantity = stocktotalquantity;
    }

    public Date getStocktime() {
        return stocktime;
    }

    public void setStocktime(Date stocktime) {
        this.stocktime = stocktime;
    }

    public String getStockname() {
        return stockname;
    }

    public void setStockname(String stockname) {
        this.stockname = stockname == null ? null : stockname.trim();
    }
}