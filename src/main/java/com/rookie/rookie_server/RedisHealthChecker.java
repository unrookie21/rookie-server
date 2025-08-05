package com.rookie.rookie_server;

import java.time.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Redis 연결 상태를 확인하는 헬스 체커 컴포넌트입니다.
 * 애플리케이션 시작 시 Redis 연결을 테스트하고 결과를 출력합니다.
 * 
 * @author rookie-team
 * @version 1.0
 * @since 2024
 */
@Component
@RequiredArgsConstructor
public class RedisHealthChecker implements CommandLineRunner {

    /**
     * Redis 연결을 위한 템플릿 객체입니다.
     */
    private final RedisTemplate<String, String> redisTemplate;

    /**
     * 애플리케이션 시작 시 실행되는 메소드입니다.
     * Redis 연결 상태를 확인하고 결과를 콘솔에 출력합니다.
     * 
     * @param args 명령행 인수 배열
     */
    @Override
    public void run(String... args) {
        try {
            String key = "health-check";
            redisTemplate.opsForValue().set(key, "ok", Duration.ofSeconds(5));
            String result = redisTemplate.opsForValue().get(key);
            if ("ok".equals(result)) {
                System.out.println("[✅ Redis 정상 연결 확인]");
            } else {
                System.out.println("[❌ Redis 응답 이상]");
            }
        } catch (Exception e) {
            System.out.println("[🚨 Redis 연결 실패]");
            e.printStackTrace();
        }
    }
}
