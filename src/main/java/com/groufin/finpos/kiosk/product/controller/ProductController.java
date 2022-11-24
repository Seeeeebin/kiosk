package com.groufin.finpos.kiosk.product.controller;

import com.groufin.finpos.kiosk.common.mvc.model.DefaultResponse;
import com.groufin.finpos.kiosk.common.mvc.model.ResponseMessage;
import com.groufin.finpos.kiosk.common.mvc.model.StatusCode;
import com.groufin.finpos.kiosk.product.service.CategoryService;
import com.groufin.finpos.kiosk.product.service.MenuService;
import com.groufin.finpos.kiosk.product.service.OptionService;
import com.groufin.finpos.kiosk.product.service.dto.*;
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
    private final MenuService menuService;

    private final OptionService optionService;
    @PostMapping("/categoryList")
    @Operation(summary = "카테고리 리스트 조회", description = "매장별 카테고리 리스트를 조회한다. ", tags = {CATEGORY_TAG})
    private ResponseEntity<CategoryListResponse> categoryList(@RequestBody CategoryListRequest request) {

        CategoryListResponse result= categoryService.getCategoriesByStoreCode(request.getStoreCode());

        return new ResponseEntity(DefaultResponse.res(StatusCode.OK, ResponseMessage.SUCCESS, result.getData()), HttpStatus.OK);

    }

    @PostMapping("/menuList")
    @Operation(summary = "메뉴 리스트 조회", description = "카테고리별 메뉴 리스트를 조회한다. ", tags = {MENU_TAG})
    private ResponseEntity<MenuListResponse> menuList(@RequestBody MenuListRequest request) {

        MenuListResponse result= menuService.getMenusByCategoryCode(request.getCategoryCode());

        return new ResponseEntity(DefaultResponse.res(StatusCode.OK, ResponseMessage.SUCCESS, result.getData()), HttpStatus.OK);

    }

    @PostMapping("/optionList")
    @Operation(summary = "옵션 리스트 조회", description = "메뉴별 옵션 리스트를 조회한다. ", tags = {OPTION_TAG})
    private ResponseEntity<OptionListResponse>  optionList(@RequestBody OptionListRequest request) {

        OptionListResponse result= optionService.getOptionsByMenuCode(request.getMenuCode());

        return new ResponseEntity(DefaultResponse.res(StatusCode.OK, ResponseMessage.SUCCESS, result.getData()), HttpStatus.OK);
        //return result;
    }


    @PostMapping("/optionGroupList")
    @Operation(summary = "옵션 그룹 리스트 조회", description = "카테고리별 옵션 그룹 리스트를 조회한다. ", tags = {OPTION_TAG})
    private ResponseEntity<OptionGroupListResponse>  optionGroupList(@RequestBody OptionListRequest request) {

        OptionGroupListResponse result= optionService.getOptionGroupsByStoreCode(request.getStoreCode());

        return new ResponseEntity(DefaultResponse.res(StatusCode.OK, ResponseMessage.SUCCESS, result.getData()), HttpStatus.OK);

    }


}
