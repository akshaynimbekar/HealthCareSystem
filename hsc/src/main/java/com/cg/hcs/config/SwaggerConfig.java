package com.cg.hcs.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
		info = @Info(
			    title = "HealthCare System ",
			    version = "V.1.0",
			    description = "This API is useful for patients "
			)
		)
@SecurityScheme(
		  name = "Bearer Authentication",
		  type = SecuritySchemeType.HTTP,
		  bearerFormat = "JWT",
		  scheme = "bearer"
		)

public class SwaggerConfig {

}
