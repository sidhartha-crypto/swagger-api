package com.inovaantage.cem.macau.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
    info = @Info(
        version = "v1",
        title = "CEM MACAU OMS",
        description = "For fetch the job details of all information of customer using jobid or meterid"
    ),
          security = @SecurityRequirement(name = "ApiKeyAuth")
)
@SecurityScheme(
		
    name = "ApiKeyAuth",
    type = io.swagger.v3.oas.annotations.enums.SecuritySchemeType.APIKEY,
    in = io.swagger.v3.oas.annotations.enums.SecuritySchemeIn.HEADER,
    paramName = "X-API-KEY"
)
public class GlobalSwaggerconfig 
{ }