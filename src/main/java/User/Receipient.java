package User;
import User.Address;
import User.BasicProfile;

import java.util.List;

public class Receipient {
    private BasicProfile basicProfile;
    private List<Address> address;

    public BasicProfile getBasicProfile() { return basicProfile; }
    public void setBasicProfile(BasicProfile basicProfile) {
        this.basicProfile = basicProfile;
    }


    public List<Address> getAddress() {
        return address;
    }
    public void setAddress(List<Address> address) {
        this.address = address;
    }


/*

    @Override
    public String toString() {
        return "Customer{" +
                ", basicProfile=" + basicProfile +
                ", address=" + address +

                '}';
    }

*/

public Receipient(){}

   }