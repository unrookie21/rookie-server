package com.rookie.rookie_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Rookie Server 애플리케이션의 메인 클래스입니다.
 * Spring Boot 애플리케이션을 시작하는 진입점 역할을 합니다.
 * 
 * @author rookie-team
 * @version 1.0
 * @since 2024
 */
@SpringBootApplication
public class RookieServerApplication {

	/**
	 * 애플리케이션의 메인 메소드입니다.
	 * Spring Boot 애플리케이션을 실행합니다.
	 * 
	 * @param args 명령행 인수 배열
	 */
	public static void main(String[] args) {
		SpringApplication.run(RookieServerApplication.class, args);
	}

}
