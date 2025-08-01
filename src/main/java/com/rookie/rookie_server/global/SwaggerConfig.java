package com.rookie.rookie_server.global;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

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