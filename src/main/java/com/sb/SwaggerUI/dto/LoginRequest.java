package com.sb.SwaggerUI.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Login request details")
@Data
public class LoginRequest {

    @Schema(description = "Login Id")
    private String loginId;

    @Schema(description = "password")
    private String password;

}
