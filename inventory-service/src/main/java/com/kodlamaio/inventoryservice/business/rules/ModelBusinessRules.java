package com.kodlamaio.inventoryservice.business.rules;

import com.kodlamaio.inventoryservice.repository.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ModelBusinessRules {

    private final ModelRepository repository;

    //todo kurallar eklenecek

    public void checkIfModelExists(UUID id) {
        if (!repository.existsById(id)) {
            //todo business exceptions
            throw new RuntimeException("model not exist");
        }
    }
}
