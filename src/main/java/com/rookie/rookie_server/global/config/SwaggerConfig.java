package com.rookie.rookie_server.global.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger/OpenAPI 문서화를 위한 설정 클래스입니다.
 * API 문서 생성 및 서버 정보를 구성합니다.
 * 
 * @author rookie-team
 * @version 1.0
 * @since 2024
 */
@Configuration
public class SwaggerConfig {

    /**
     * OpenAPI 설정을 구성하는 빈을 생성합니다.
     * API 문서의 정보와 서버 설정을 포함합니다.
     * 
     * @return 구성된 OpenAPI 객체
     */
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .version("v1.0")
                .title("Rookie Server API")
                .description("Rookie Server API 문서");

        Server server = new Server();
        server.setUrl("https://api.seongje1732-test.org");
        server.setDescription("Production server");

        return new OpenAPI()
                .info(info)
                .servers(List.of(server));
    }
}