package com.groufin.finpos.kiosk.product.repository;

import com.groufin.finpos.kiosk.product.domain.Category;
import com.groufin.finpos.kiosk.product.service.dto.CategoryDetails;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

    List<Category> findByStoreCode(String storeCode);

}
