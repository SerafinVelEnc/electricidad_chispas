public class serviceRecord implements salesLine{
    private Integer serviceCode;
    private String name;
    private Integer cost;
    private Integer vatRate;

    public Integer getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setVatRate(Integer vatRate) {
        this.vatRate = vatRate;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer getCost() {
        return null;
    }

    @Override
    public Integer getVatRate() {
        return null;
    }
}
