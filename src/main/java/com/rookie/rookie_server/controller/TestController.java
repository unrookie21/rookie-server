package com.rookie.rookie_server.controller;

import com.rookie.rookie_server.Book;
import com.rookie.rookie_server.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 테스트용 REST API 컨트롤러입니다.
 * 기본적인 API 테스트와 Book 엔티티 관련 기능을 제공합니다.
 * 
 * @author rookie-team
 * @version 1.0
 * @since 2024
 */
@RestController
@RequiredArgsConstructor
public class TestController {

    /**
     * Book 엔티티에 대한 데이터 접근 리포지토리입니다.
     */
    private final BookRepository bookRepository;

    /**
     * 서버 상태를 확인하는 기본 테스트 엔드포인트입니다.
     * 
     * @return 성공 메시지를 포함한 HTTP 응답
     */
    @GetMapping("/")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("test success updated");
    }

    /**
     * 새로운 책을 생성하고 저장하는 엔드포인트입니다.
     * 
     * @return 저장된 Book 객체를 포함한 HTTP 응답
     */
    @GetMapping("/save")
    public ResponseEntity<Book> save(){
        Book book = new Book("book1");
        bookRepository.save(book);
        return ResponseEntity.ok(book);
    }

    /**
     * 저장된 모든 책 목록을 조회하는 엔드포인트입니다.
     * 
     * @return 모든 Book 객체 목록을 포함한 HTTP 응답
     */
    @GetMapping("/books")
    public ResponseEntity<Iterable<Book>> getAllBooks() {
        return ResponseEntity.ok(bookRepository.findAll());
    }

    /**
     * 저장된 책의 총 개수를 조회하는 엔드포인트입니다.
     * 
     * @return 책의 총 개수를 포함한 HTTP 응답
     */
    @GetMapping("/books/count")
    public ResponseEntity<Long> getBookCount() {
        return ResponseEntity.ok(bookRepository.count());
    }

}
