public class freelance implements customer{

    private Integer customerCode;
    private String name;
    private String surname;
    private String dni;
    private String address;
    private String city;
    private String province;
    private String email;
    private String phone;

    public void setCustomerCode(Integer customerCode) {
        this.customerCode = customerCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Integer getCustomerCode() {
        return this.customerCode;
    }

    @Override
    public String getName() {
        return this.name+" "+surname;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public String getProvince() {
        return this.province;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getPhone() {
        return this.phone;
    }
}
