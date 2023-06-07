package com.example.bdia.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookDto {
    private Long id;
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
