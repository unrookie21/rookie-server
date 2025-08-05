package com.rookie.rookie_server;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Book 엔티티에 대한 데이터 접근 리포지토리 인터페이스입니다.
 * Spring Data JPA의 JpaRepository를 상속받아 기본적인 CRUD 연산을 제공합니다.
 * 
 * @author rookie-team
 * @version 1.0
 * @since 2024
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
