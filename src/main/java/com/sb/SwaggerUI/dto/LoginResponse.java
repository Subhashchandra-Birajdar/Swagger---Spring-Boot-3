package com.sb.SwaggerUI.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Login response details")
@Data
public class LoginResponse {

    @Schema(description = "Response string")
    private String response;



}
