package vn.edu.iuh.fit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity@Getter@Setter@NoArgsConstructor @AllArgsConstructor
public class ProductQuantity {
    @Id
    @OneToOne
    private Product product;
    private float quantity;
}