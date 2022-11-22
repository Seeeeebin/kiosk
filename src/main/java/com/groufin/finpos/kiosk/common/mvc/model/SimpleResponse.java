package com.groufin.finpos.kiosk.common.mvc.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Value;

@Value
@Schema(description = "API 호출 결과")
public class SimpleResponse {

    @Schema(description = "성공/실패 여부")
    boolean ok;

    @Schema(description = "실패시 메시지 (성공시 NULL)")
    String message;

    public static SimpleResponse fails(String message) {
        return new SimpleResponse(Boolean.FALSE, message);
    }

    public static SimpleResponse ok() {
        return new SimpleResponse(Boolean.TRUE, null);
    }
}
