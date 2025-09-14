package in.bm.DatabaseRelationalApplication.MODEL;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="User_address")
public class Address {
    @Id
    @NotNull
    @JsonProperty("Address_id")
    @Column(name="Address_id")
    private int id;

    @NotBlank
    @JsonProperty("aArea")
    private String area;

    @NotBlank
    @JsonProperty("aCity")
    private String city;




}
