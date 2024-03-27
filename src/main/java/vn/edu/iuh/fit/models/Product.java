package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity@Getter@Setter@NoArgsConstructor@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @OneToOne
    private ProductQuantity productQuantity;

    public Product(String name, String description, ProductQuantity productQuantity) {
        this.name = name;
        this.description = description;
        this.productQuantity = productQuantity;
    }
}
