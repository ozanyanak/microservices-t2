package com.kodlamaio.filterservice.business.concretes;

import com.kodlamaio.commonpackage.utils.mappers.ModelMapperService;
import com.kodlamaio.filterservice.business.abstracts.FilterService;
import com.kodlamaio.filterservice.business.dto.response.GetAllFilterResponse;
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
    private final ModelMapperService mapper;

    //todo filterservice manager ayarlanacak
    @Override
    public List<GetAllFilterResponse> getall() {
        return null;

    }

    @Override
    public GetFilterResponse getById(UUID id) {
        return null;
    }

    @Override
    public void add(Filter filter) {

    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public void deleteByBrandId(UUID brandId) {

    }

    @Override
    public void deleteByModeldId(UUID modelId) {

    }
}
