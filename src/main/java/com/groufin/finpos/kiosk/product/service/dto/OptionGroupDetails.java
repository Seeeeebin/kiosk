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
@Schema(description = "옵션 그룹 정보")
public class OptionGroupDetails {


    @Schema(description = "옵션 코드")
    private String optionCode;

    @Schema(description = "옵션 그룹 시퀀스")
    private Integer optionGroupSeq;

}
