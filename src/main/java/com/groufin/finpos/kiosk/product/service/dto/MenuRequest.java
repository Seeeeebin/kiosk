package com.groufin.finpos.kiosk.product.service.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Schema(description = "메뉴 리스트 호출 요청값")
public class MenuRequest {
    @Schema(description = "스토어 코드")
    private String storeCode;

    @Schema(description = "카테고리 코드")
    private String categoryCode;

    @Schema(description = "통합 정책 사용 여부")
    private String policyCombineYn;




}
