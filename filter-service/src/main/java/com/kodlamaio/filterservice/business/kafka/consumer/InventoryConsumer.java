package com.kodlamaio.filterservice.business.kafka.consumer;

import com.kodlamaio.commonpackage.Events.CarCreatedEvent;
import com.kodlamaio.commonpackage.utils.mappers.ModelMapperService;
import com.kodlamaio.filterservice.business.abstracts.FilterService;
import com.kodlamaio.filterservice.entities.Filter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class InventoryConsumer {
    private final FilterService service;
    private final ModelMapperService mapper;

    @KafkaListener(
            topics = "car-created",
            groupId = "car-create"


    )
    public void consume(CarCreatedEvent event) {
        var filter = mapper.forResponse().map(event, Filter.class);
        service.add(filter);
        log.info("car created event consumed{}", event);
    }
}
