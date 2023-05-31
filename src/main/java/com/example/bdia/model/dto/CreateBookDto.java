package com.example.bdia.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class CreateBookDto {
    @NotNull
    @Size(min = 4, max = 128)
    private String title;
    @NotNull
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
