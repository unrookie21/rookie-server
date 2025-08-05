package com.rookie.rookie_server;

import java.time.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RedisHealthChecker implements CommandLineRunner {

    private final RedisTemplate<String, String> redisTemplate;

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
