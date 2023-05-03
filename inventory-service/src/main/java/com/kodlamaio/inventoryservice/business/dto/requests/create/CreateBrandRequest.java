package com.kodlamaio.inventoryservice.business.dto.requests;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateBrandRequest {
    @NotBlank
    @Size(min=2, max = 10)
    private String name;

}
