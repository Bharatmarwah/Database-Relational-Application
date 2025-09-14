package in.bm.DatabaseRelationalApplication.MODEL;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="User_order")
public class Order {

    @Id
    @Column(name="Order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    @NotBlank
    @JsonProperty("product_name")
    @Column(name="Product_name")
    private String product_name;

    @NotNull
    @JsonProperty("prize")
    @Column(name="Prize")
    private double prize;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonBackReference
    private User user;

}
