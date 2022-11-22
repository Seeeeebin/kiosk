package com.groufin.finpos.kiosk.product.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Schema(description = "카테고리 리스트 호출 요청값")
public class CategoryRequest {
    @Schema(description = "스토어 코드")
    private String storeCode;




}
