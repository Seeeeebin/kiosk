package com.groufin.finpos.kiosk.product.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "메뉴 정보")
public class MenuDetails {




    @Schema(description = "스토어 코드")
    private String storeCode;

    @Schema(description = "카테고리 코드")
    private String categoryCode;

    @Schema(description = "메뉴 코드")
    private String menuCode;

    @Schema(description = "메뉴명")
    private String menuName;

    @Schema(description = "바코드")
    private String barcode;

    @Schema(description = "메뉴 설명")
    private String menuDescription;

    @Schema(description = "과세 여부")
    private String taxFlag;

    @Schema(description = "노출 순서")
    private String displayIndex;

    @Schema(description = "POS 노출 여부")
    private String posDisplayYn;

    @Schema(description = "APP 노출 여부")
    private String appDisplayYn;

    @Schema(description = "KIOSK 노출 여부")
    private String kioskDisplayYn;

    @Schema(description = "상품 가격")
    private String costPrice;

    @Schema(description = "스마트오더 사용여부")
    private String onlineOrderYn;

    @Schema(description = "품절 일시")
    private String onlineSoldoutDate;

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

    @Schema(description = "스탬프 사용여부")
    private String stampYn;

    @Schema(description = "포인트 사용여부")
    private String pointYn;

    @Schema(description = "사용여부")
    private String useYn;

    @Schema(description = "스마트 오더 사용 여부")
    private String orderStateYn;

    @Schema(description = "파일 명")
    private String fileName;

    @Schema(description = "영수증 출력명")
    private String sheetName;

    @Schema(description = "파일경로")
    private String filePath;

    @Schema(description = "재고 관리 여부")
    private String inventoryYn;

    @Schema(description = "재고 수량")
    private Integer inventoryCount;








}
