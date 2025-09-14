package in.bm.DatabaseRelationalApplication.MODEL;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roles_id;

    @Column(name="roles")
    @JsonProperty("roles")
    private String roles;

    @ManyToMany(mappedBy = "roles")
    @JsonBackReference
    private List<User> user;
}
