package in.bm.DatabaseRelationalApplication.MODEL;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Embeddable // marks a class whose field will be embedded in another entity
public class Laptop {

    @JsonProperty("lName")
    @Column(name="LaptopName")
    @NotBlank
    private String laptop_name;

    @JsonProperty("lBrand")
    @Column(name="LaptopBrand")
    @NotBlank
    private String laptop_brand;


    @JsonProperty("lPrice")
    @Column(name="LaptopPrice")
    @NotNull
    private double laptop_price;


}
