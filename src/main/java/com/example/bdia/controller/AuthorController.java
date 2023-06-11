package com.example.bdia.controller;

import com.example.bdia.model.converter.Author2AuthorDtoConverter;
import com.example.bdia.model.dto.AuthorDto;
import com.example.bdia.model.dto.CreateAuthorDto;
import com.example.bdia.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/author")
public class AuthorController {

    private final Author2AuthorDtoConverter author2AuthorDtoConverter;
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
        author2AuthorDtoConverter = new Author2AuthorDtoConverter();
    }

    @PostMapping(value = "/create")
    public ResponseEntity<AuthorDto> createAuthor(@RequestBody @Valid CreateAuthorDto createAuthorDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(author2AuthorDtoConverter.convert(authorService.createAuthor(createAuthorDto)));
    }

}
