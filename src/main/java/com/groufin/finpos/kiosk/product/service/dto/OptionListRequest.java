package com.groufin.finpos.kiosk.product.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "옵션 리스트 요청")
public class OptionListRequest {

    @Schema(description = "메뉴 코드")
    private String menuCode;

}
