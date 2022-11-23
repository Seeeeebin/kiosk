package com.groufin.finpos.kiosk.product.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "메뉴 리스트 요청")
public class MenuListRequest {

    @Schema(description = "카테고리 코드")
    private String categoryCode;

}
