package com.apitesting.api.users;
import javax.persistence.*;
import java.util.List;

import lombok.*;
import java.io.Serializable;

@Data
@ToString
@Entity
public class Customer implements Serializable {
    @Id
    private String orderId;
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Product")
    private List<Product> products;
    @OneToOne(targetEntity = Receipient.class, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "Receipient")
    private Receipient receipient;
}