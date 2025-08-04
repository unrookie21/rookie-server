package com.rookie.rookie_server.controller;

import com.rookie.rookie_server.Book;
import com.rookie.rookie_server.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final BookRepository bookRepository;

    @GetMapping("/")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("test success updated");
    }

    @GetMapping("/save")
    public ResponseEntity<Book> save(){
        Book book = new Book("book1");
        bookRepository.save(book);
        return ResponseEntity.ok(book);
    }
}
