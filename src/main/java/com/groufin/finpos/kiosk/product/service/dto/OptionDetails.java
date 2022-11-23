package com.groufin.finpos.kiosk.product.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "옵션 정보")
public class OptionDetails {


    @Schema(description = "스토어 코드")
    private String storeCode;

    @Schema(description = "카테고리 코드")
    private String categoryCode;

    @Schema(description = "옵션 코드")
    private String optionCode;

    @Schema(description = "옵션명")
    private String optionName;

    @Schema(description = "노출 순서")
    private String displayIndex;

    @Schema(description = "POS 노출 여부")
    private String posDisplayYn;

    @Schema(description = "APP 노출 여부")
    private String appDisplayYn;

    @Schema(description = "KIOSK 노출 여부")
    private String kioskDisplayYn;

    @Schema(description = "상품 가격")
    private String optionPrice;

    @Schema(description = "폰트 색상1")
    private String f1Color;

    @Schema(description = "폰트 색상2")
    private String f2Color;

    @Schema(description = "배경 색상")
    private String b1Color;

    @Schema(description = "클릭시의 색상")
    private String c1Color;

    @Schema(description = "등록일시")
    private String regDate;

    @Schema(description = "수정일시")
    private String modDate;

    @Schema(description = "사용여부")
    private String useYn;


    @Schema(description = "영수증 출력명")
    private String sheetName;

    @Schema(description = "재고 관리 여부")
    private String inventoryYn;

    @Schema(description = "재고 수량")
    private Integer inventoryCount;

    @Schema(description = "정렬")
    private Integer sort;

    @Schema(description = "중복 선택 여부")
    private String duplicate_yn;

    @Schema(description = "옵션 그룹 시퀀스")
    private Integer option_group_seq;

    @Schema(description = "필수 여부")
    private String required_yn;

    @Schema(description = "옵션 그룹 코드")
    private String group_code;

    @Schema(description = "옵션 그룹 이름")
    private String group_name;

    @Schema(description = "필수 옵션 그룹 코드")
    private String required_option_group;






}
