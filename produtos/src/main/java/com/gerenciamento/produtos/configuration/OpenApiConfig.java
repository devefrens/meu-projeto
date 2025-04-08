package com.gerenciamento.produtos.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.awt.SystemColor.info;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI testeOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Projeto pessoa")
                        .version("1.0.0")
                        .description("Roda por favor")
                );
    }
}
