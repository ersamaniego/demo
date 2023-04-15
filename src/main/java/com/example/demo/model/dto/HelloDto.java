package com.example.demo.model.dto;

//import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HelloDto {

    @Id
    @NotNull
    private Long id;

    @NotNull
    @Size(min = 1, max = 30)
    @Pattern(regexp = "^[A-Z][a-z]{1,30}$")
//    @ApiModelProperty(example = "Carlos")
    private String nombre;

    @NotNull
    @Size(min=1, max=30)
    @Pattern(regexp = "^[A-Z][a-z]{1,30}$")
//    @ApiModelProperty(example = "Perez")
    private String apellido;
}
