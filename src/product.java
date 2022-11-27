public class product implements salesLine{
    private Integer productCode;
    private String name;
    private String mark;
    private String model;
    private Integer cost;
    private Integer vatRate;

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setVatRate(Integer vatRate) {
        this.vatRate = vatRate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public Integer getVatRate() {
        return vatRate;
    }
}
