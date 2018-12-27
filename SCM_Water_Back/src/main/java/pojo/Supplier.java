package pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-12-27
 */
public class Supplier {
    /**
     * 提供商Id
     */
    private Integer supplierid;

    /**
     * 提供商名
     */
    private String suppliername;

    /**
     * 提供商电话
     */
    private String suppliephone;

    /**
     * 提供商地址
     */
    private String suppliersite;

    /**
     * 联系人
     */
    private String suppliercontacts;

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSuppliephone() {
        return suppliephone;
    }

    public void setSuppliephone(String suppliephone) {
        this.suppliephone = suppliephone == null ? null : suppliephone.trim();
    }

    public String getSuppliersite() {
        return suppliersite;
    }

    public void setSuppliersite(String suppliersite) {
        this.suppliersite = suppliersite == null ? null : suppliersite.trim();
    }

    public String getSuppliercontacts() {
        return suppliercontacts;
    }

    public void setSuppliercontacts(String suppliercontacts) {
        this.suppliercontacts = suppliercontacts == null ? null : suppliercontacts.trim();
    }
}