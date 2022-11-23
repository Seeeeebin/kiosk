package com.groufin.finpos.kiosk.product.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@Schema(description = "카테고리 리스트 호출 요청값")
public class CategoryListRequest {

    @Schema(description = "스토어 코드")
    private String storeCode;

}
