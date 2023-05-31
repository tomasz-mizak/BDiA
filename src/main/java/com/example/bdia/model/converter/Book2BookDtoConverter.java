package com.example.bdia.model.converter;

import com.example.bdia.model.Book;
import com.example.bdia.model.dto.BookDto;
import org.springframework.core.convert.converter.Converter;

public class Book2BookDtoConverter implements Converter<Book, BookDto> {

    private final Author2AuthorDtoConverter author2AuthorDtoConverter;

    public Book2BookDtoConverter() {
        this.author2AuthorDtoConverter = new Author2AuthorDtoConverter();
    }

    @Override
    public BookDto convert(Book source) {
        if (source.getAuthor() == null) throw new IllegalArgumentException("AUTHOR_CANNOT_BE_NULL");
        return BookDto.builder()
                .id(source.getId())
                .title(source.getTitle())
                .author(author2AuthorDtoConverter.convert(source.getAuthor()))
                .isbn(source.getIsbn())
                .publicationYear(source.getPublicationYear())
                .publisher(source.getPublisher())
                .genre(source.getGenre())
                .description(source.getDescription())
                .price(source.getPrice())
                .language(source.getLanguage())
                .numberOfPages(source.getNumberOfPages())
                .build();
    }
}
