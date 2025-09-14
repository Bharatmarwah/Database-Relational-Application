package in.bm.DatabaseRelationalApplication.MODEL;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name="User_info")
public class User {

    @Id
    @JsonProperty("id")
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @JsonProperty("name")
    @Column(name="name")
    @NotBlank
    private String user_name;

    @JsonProperty("email")
    @Column(name="email")
    @NotBlank
    @Email
    private String user_email;

    @Embedded
    private Laptop laptop;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Order> order;



    @ManyToMany
    private List<Roles> roles = new ArrayList<>();

}
