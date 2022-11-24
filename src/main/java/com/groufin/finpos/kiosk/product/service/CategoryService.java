package com.groufin.finpos.kiosk.product.service;

import com.groufin.finpos.kiosk.product.domain.Category;
import com.groufin.finpos.kiosk.product.repository.CategoryRepository;
import com.groufin.finpos.kiosk.product.service.dto.CategoryDetails;
import com.groufin.finpos.kiosk.product.service.dto.CategoryListResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class CategoryService {
    @Autowired
    private ModelMapper modelMapper;
    private final CategoryRepository categoryRepository;

    public CategoryListResponse getCategoriesByStoreCode(String storeCode) {

        List<Category> categoryList = categoryRepository.findByStoreCode(storeCode);

        List<CategoryDetails> resultList = categoryList.stream().map( category -> modelMapper.map(category, CategoryDetails.class) ).collect(Collectors.toList());


        return CategoryListResponse.builder()
                .data(resultList)
                .build();


    }


}
