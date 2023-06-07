package com.example.bdia.controller;

import com.example.bdia.model.converter.Book2BookDtoConverter;
import com.example.bdia.model.dto.BookDto;
import com.example.bdia.model.dto.CreateBookDto;
import com.example.bdia.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
    public ResponseEntity<BookDto> createBook(@RequestBody CreateBookDto createBookDto) {
        return ResponseEntity.status(201)
                .body(book2BookDtoConverter.convert(
                        bookService.createBook(createBookDto)));
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<BookDto>> getAllBooks() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(bookService.getAllBooks().stream()
                        .map(book2BookDtoConverter::convert).collect(Collectors.toList()));
    }

}
