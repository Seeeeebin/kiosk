package com.groufin.finpos.kiosk.product.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Schema(description = "카테고리 정보")
public class CategoryDetails {


    @Schema(description = "카테고리 코드")
    private String categoryCode;

    @Schema(description = "카테고리 이름")
    private String categoryName;

    @Schema(description = "노출 순서")
    private String displayIndex;

    @Schema(description = "폰트 색상 1")
    private String f1Color;

    @Schema(description = "폰트 색상 2")
    private String f2Color;

    @Schema(description = "바탕 색상")
    private String b1Color;

    @Schema(description = "클릭시의 색상")
    private String c1Color;



}
