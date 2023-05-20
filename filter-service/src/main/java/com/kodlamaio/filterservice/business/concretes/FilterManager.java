package com.kodlamaio.filterservice.business.concretes;

import com.kodlamaio.commonpackage.utils.mappers.ModelMapperService;
import com.kodlamaio.filterservice.business.abstracts.FilterService;
import com.kodlamaio.filterservice.business.dto.response.GetAllFiltersResponse;
import com.kodlamaio.filterservice.business.dto.response.GetFilterResponse;
import com.kodlamaio.filterservice.entities.Filter;
import com.kodlamaio.filterservice.repository.FilterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class FilterManager implements FilterService {
    private final FilterRepository repository;
    private ModelMapperService mapper;

    @Override
    public List<GetAllFiltersResponse> getAll() {
        var filters = repository.findAll();
        var response = filters
                .stream()
                .map(filter -> mapper.forResponse().map(filter, GetAllFiltersResponse.class))
                .toList();

        return response;
    }

    @Override
    public GetFilterResponse getById(UUID id) {
        var filter = repository.findById(id).orElseThrow();
        var response = mapper.forResponse().map(filter, GetFilterResponse.class);

        return response;
    }

    @Override
    public void add(Filter filter) {

        repository.save(filter);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteByBrandId(UUID brandId) {

    }

    @Override
    public void deleteByModeldId(UUID modelId) {

    }


}