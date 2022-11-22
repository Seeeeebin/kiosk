package com.groufin.finpos.kiosk.product.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Schema(description = "카테고리 정보")
public class CategoryResponse {

    @Schema(description = "카테고리 코드")
    private String category_code;

    @Schema(description = "카테고리 이름")
    private String category_name;

    @Schema(description = "노출 순서")
    private String display_index;

    @Schema(description = "폰트 색상 1")
    private String f1_color;

    @Schema(description = "폰트 색상 2")
    private String f2_color;

    @Schema(description = "바탕 색상")
    private String b1_color;

    @Schema(description = "클릭시의 색상")
    private String c1_color;

}
