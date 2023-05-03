package com.kodlamaio.inventoryservice.business.rules;

import com.kodlamaio.inventoryservice.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CarBusinessRules {

    private final CarRepository repository;

    //todo kurallar eklenecek

    public void checkIfCarExists(UUID id) {
        if (!repository.existsById(id)) {
            //todo business exceptions
            throw new RuntimeException("car not exist");
        }
    }
}
