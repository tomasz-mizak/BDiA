package com.example.bdia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book extends AbstractEntity {

    private String title;
    @OneToOne
    private Author author;
    private String isbn;
    private String publicationYear;
    private String publisher;
    private String genre;
    private String description;
    private Double price;
    private String language;
    private Integer numberOfPages;

}
