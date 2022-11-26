public class invoiceSheet {
    private Integer invoiceCode;
    private String invoiceDate;
    private String customer;
    private String product;
    private String service;
    private Integer taxBase;
    private Integer total;

    public Integer getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(Integer invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Integer getTaxBase() {
        return taxBase;
    }

    public void setTaxBase(Integer taxBase) {
        this.taxBase = taxBase;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
