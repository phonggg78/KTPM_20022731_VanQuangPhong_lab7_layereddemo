package vn.edu.iuh.fit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity@Setter@Getter@NoArgsConstructor
public class Customer {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long custid;
    private String custName;
    private String email;
    private String phone;

    public Customer(String custName, String email, String phone) {
        this.custName = custName;
        this.email = email;
        this.phone = phone;
    }
}
