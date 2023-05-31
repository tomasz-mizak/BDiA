package com.example.bdia.controller;

import com.example.bdia.model.converter.Book2BookDtoConverter;
import com.example.bdia.model.dto.BookDto;
import com.example.bdia.model.dto.CreateBookDto;
import com.example.bdia.service.BookService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    private final BookService bookService;
    private final Book2BookDtoConverter book2BookDtoConverter;

    public BookController(BookService bookService) {
        this.bookService = bookService;
        this.book2BookDtoConverter = new Book2BookDtoConverter();
    }

    @PostMapping(value = "/create")
    public ResponseEntity<BookDto> createBook(@Valid @RequestBody CreateBookDto createBookDto) {
        return ResponseEntity.status(201)
                .body(book2BookDtoConverter.convert(
                        bookService.createBook(createBookDto)));
    }

}
