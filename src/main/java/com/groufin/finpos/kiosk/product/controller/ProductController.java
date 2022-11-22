package com.groufin.finpos.kiosk.product.controller;

import com.groufin.finpos.kiosk.common.mvc.model.DefaultResponse;
import com.groufin.finpos.kiosk.common.mvc.model.ResponseMessage;
import com.groufin.finpos.kiosk.common.mvc.model.StatusCode;
import com.groufin.finpos.kiosk.product.service.CategoryService;
import com.groufin.finpos.kiosk.product.service.MenuService;
import com.groufin.finpos.kiosk.product.service.dto.CategoryDetails;
import com.groufin.finpos.kiosk.product.service.dto.CategoryRequest;
import com.groufin.finpos.kiosk.product.service.dto.MenuDetails;
import com.groufin.finpos.kiosk.product.service.dto.MenuRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/external/v1")
@Tag(name = ProductController.PRODUCT_TAG, description = "Product API")
public class ProductController {

    public static final String PRODUCT_TAG      = "[카테고리 / 메뉴 / 옵션 / 재고] 관련 API";
    public static final String CATEGORY_TAG     = "[카테고리] 관련 API";
    public static final String MENU_TAG         = "[메뉴] 관련 API";
    public static final String OPTION_TAG       = "[옵션] 관련 API";
    public static final String INVENTORY_TAG    = "[재고] 관련 API";

    private final CategoryService categoryService;
    private final MenuService MenuService;

    @PostMapping("/categoryList")
    @Operation(summary = "카테고리 리스트 조회", description = "매장별 카테고리 리스트를 조회한다. ", tags = {CATEGORY_TAG})
    private ResponseEntity<List<CategoryDetails>> categoryList(@RequestBody CategoryRequest request) {

        List<CategoryDetails> result= categoryService.getCategoriesByStoreCode(request.getStoreCode());

        //return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.getCategoriesByStoreCode(request.getStoreCode()));
        return new ResponseEntity(DefaultResponse.res(StatusCode.OK, ResponseMessage.SUCCESS, result), HttpStatus.OK);

    }

    @PostMapping("/menuList")
    @Operation(summary = "메뉴 리스트 조회", description = "카테고리별 메뉴 리스트를 조회한다. ", tags = {MENU_TAG})
    private ResponseEntity<List<MenuDetails>> menuList(@RequestBody MenuRequest request) {

        List<MenuDetails> result= MenuService.getMenusByCategoryCode(request.getCategoryCode());

        //return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.getCategoriesByStoreCode(request.getStoreCode()));
        return new ResponseEntity(DefaultResponse.res(StatusCode.OK, ResponseMessage.SUCCESS, result), HttpStatus.OK);

    }

}
