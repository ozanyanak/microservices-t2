package com.kodlamaio.inventoryservice.business.rules;

import com.kodlamaio.inventoryservice.repository.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class BrandBusinessRules {

    private final BrandRepository repository;

    //todo kurallar eklenecek

    public void checkIfBrandExists(UUID id) {
        if (!repository.existsById(id)) {
            //todo business exceptions
            throw new RuntimeException("brand not exist");
        }
    }
}

