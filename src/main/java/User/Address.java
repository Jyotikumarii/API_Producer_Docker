package User;

public class Address {

    private String addressType;
    private String city;
    private String state;
    private String country;

    public String getaddressType() {
        return addressType;
    }
    public void setaddressType(String addressType) {
        this.addressType = addressType;
    }




    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public String getstate() {
        return state;
    }

    public void setstate(String state) {
        this.state = state;
    }




    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



/*
    @Override
    public String toString() {
        return "{" +
                "AddressType='" + addressType + '\'' +
                ", city='" + city + '\'' +
                ", State=" + state +
                ", country='" + country + '\'' +
                '}';
    }

*/
    public Address() {}
}