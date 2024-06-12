package com.project.EpicByte.model.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class ToyAddDTO extends BaseAddDTO {
    @NotEmpty(message = "{product.brand.empty.error.message}")
    private String brand;
}