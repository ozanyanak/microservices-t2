package com.kodlamaio.filterservice.business.abstracts;

import com.kodlamaio.filterservice.business.dto.response.GetAllFilterResponse;
import com.kodlamaio.filterservice.business.dto.response.GetFilterResponse;
import com.kodlamaio.filterservice.entities.Filter;

import java.util.List;
import java.util.UUID;

public interface FilterService {
    List<GetAllFilterResponse> getall();

    GetFilterResponse getById(UUID id);

    void add(Filter filter);

    void delete(UUID id);

    void deleteByBrandId(UUID brandId);

    void deleteByModeldId(UUID modelId);


}
