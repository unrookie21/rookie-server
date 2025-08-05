package com.rookie.rookie_server.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Redis 데이터베이스 연결 및 설정을 담당하는 구성 클래스입니다.
 * RedisTemplate의 직렬화 방식을 설정합니다.
 * 
 * @author rookie-team
 * @version 1.0
 * @since 2024
 */
@Configuration
public class RedisConfig {

    /**
     * Redis 연결을 위한 RedisTemplate 빈을 생성합니다.
     * 키는 문자열로, 값은 JSON 형태로 직렬화하도록 설정합니다.
     * 
     * @param connectionFactory Redis 연결 팩토리
     * @return 구성된 RedisTemplate 객체
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return template;
    }
}
