package User;

import java.util.List;

public class Customer {

    private OrderId id;
    private Receipient receipient;
    private List<Product> product;

    public OrderId getId() { return id; }
    public void setId(OrderId id) {this.id = id;}

 //public String getId() { return id; }
    //public void setId(String id) { this.id = id; }



    public Receipient getReceipient() {
        return receipient;
    }
    public void getReceipient(Receipient receipient) {
        this.receipient = receipient;
    }


    public List<Product> getProduct() {
        return product;
    }
    public void getProduct(List<Product> address) {
        this.product = address;
    }


/*
    @Override
   public String toString() {
        return "Customer{" +
                "orderId=" + id +
               ", product=" + product +
               ", receipient=" + receipient +
               '}';
    }

*/
    public Customer(String s, int i, boolean b){}

}