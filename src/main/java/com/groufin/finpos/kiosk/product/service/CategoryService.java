package com.groufin.finpos.kiosk.product.service;

import com.groufin.finpos.kiosk.product.domain.Category;
import com.groufin.finpos.kiosk.product.repository.CategoryRepository;
import com.groufin.finpos.kiosk.product.service.dto.CategoryDetails;
import lombok.RequiredArgsConstructor;
import oracle.jdbc.proxy.annotation.Post;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class CategoryService {
    @Autowired
    private ModelMapper modelMapper;
    private final CategoryRepository categoryRepository;

    public List<CategoryDetails> getCategoriesByStoreCode(String storeCode) {

        //ModelMapper modelMapper = new ModelMapper();

        List<Category> categoryList = categoryRepository.findByStoreCode(storeCode);

        //1번
        List<CategoryDetails> resultList = categoryList.stream().map(
                category -> modelMapper.map(category, CategoryDetails.class)
        ).collect(Collectors.toList());

        //2번
        List<CategoryDetails> resultList2 = Arrays.asList(modelMapper.map(categoryList,CategoryDetails[].class));


        return resultList;


    }


}
