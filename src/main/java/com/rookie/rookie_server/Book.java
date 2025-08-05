package com.rookie.rookie_server;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 책 정보를 나타내는 엔티티 클래스입니다.
 * 데이터베이스의 Book 테이블과 매핑됩니다.
 * 
 * @author rookie-team
 * @version 1.0
 * @since 2024
 */
@Entity
@Getter
@NoArgsConstructor
public class Book {

    /**
     * 책의 고유 식별자입니다.
     * 데이터베이스에서 자동으로 생성됩니다.
     */
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 책의 이름입니다.
     */
    private String name;

    /**
     * 책 이름을 받아 Book 객체를 생성하는 생성자입니다.
     * 
     * @param name 책의 이름
     */
    public Book(String name) {
        this.name = name;
    }
}
