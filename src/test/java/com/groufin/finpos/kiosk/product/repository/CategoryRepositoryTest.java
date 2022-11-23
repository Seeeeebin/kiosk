package com.groufin.finpos.kiosk.product.repository;

import com.groufin.finpos.kiosk.product.domain.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryRepositoryTest {
    @Autowired CategoryRepository categoryRepository;

    @Test
    public void testMember(){
        Category category = new Category("0100004");

        List<Category> listCategory = categoryRepository.findByStoreCode(category.getStoreCode());


       // assertThat(listCategory.get)
    }
}