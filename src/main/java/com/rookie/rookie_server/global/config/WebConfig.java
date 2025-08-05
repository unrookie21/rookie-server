package com.rookie.rookie_server.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 웹 관련 설정을 담당하는 구성 클래스입니다.
 * CORS(Cross-Origin Resource Sharing) 정책을 설정합니다.
 * 
 * @author rookie-team
 * @version 1.0
 * @since 2024
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * CORS 매핑을 추가하여 크로스 오리진 요청을 허용합니다.
     * 특정 도메인에서의 API 호출을 허용하도록 설정합니다.
     * 
     * @param registry CORS 레지스트리 객체
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://api.seongje1732-test.org"
                , "https://api.seongje1732-test.org")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
}
