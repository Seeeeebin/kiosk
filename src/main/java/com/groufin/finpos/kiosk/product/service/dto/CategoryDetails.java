package com.groufin.finpos.kiosk.product.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "카테고리 정보")
public class CategoryDetails {



    @Schema(description = "스토어 코드")
    private String storeCode;

    @Schema(description = "카테고리 코드")
    private String categoryCode;

    @Schema(description = "카테고리 이름")
    private String categoryName;

    @Schema(description = "사용여부")
    private String useYn;

    @Schema(description = "노출 순서")
    private String displayIndex;

    @Schema(description = "POS 노출 여부")
    private String pos_display_yn;

    @Schema(description = "APP 노출 여부")
    private String app_display_yn;

    @Schema(description = "KIOSK 노출 여부")
    private String kiosk_display_yn;

    @Schema(description = "폰트 색상 1")
    private String f1Color;

    @Schema(description = "폰트 색상 2")
    private String f2Color;

    @Schema(description = "바탕 색상")
    private String b1Color;

    @Schema(description = "클릭시의 색상")
    private String c1Color;

    @Schema(description = "정렬")
    private String sort;

    @Schema(description = "등록일시")
    private String regDate;

    @Schema(description = "수정일시")
    private String modDate;


}
