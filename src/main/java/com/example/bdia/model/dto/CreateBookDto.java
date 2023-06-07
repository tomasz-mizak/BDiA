package com.example.bdia.model.dto;

import lombok.Getter;

@Getter
public class CreateBookDto {
    private String title;
    private AuthorDto author;
    private String isbn;
    private String publicationYear;
    private String publisher;
    private String genre;
    private String description;
    private Double price;
    private String language;
    private Integer numberOfPages;
}
