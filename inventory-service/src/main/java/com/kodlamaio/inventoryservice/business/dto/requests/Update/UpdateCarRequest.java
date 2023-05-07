package com.kodlamaio.inventoryservice.business.dto.requests.Update;

import com.kodlamaio.commonpackage.utils.annotations.NotFutureYear;
import com.kodlamaio.commonpackage.utils.annotations.ValidPlate;
import com.kodlamaio.inventoryservice.entities.enums.State;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCarRequest {
    @NotNull
    private UUID modelId;
    @Min(value = 2000)
    @NotFutureYear
    private int modelYear;
    @NotBlank
    @ValidPlate

    private String plate;
    @NotNull
    private State state;
    @Min(value = 1)
    private double dailyPrice;
}
