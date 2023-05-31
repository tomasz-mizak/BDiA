package com.example.bdia.service;

import com.example.bdia.model.Author;
import com.example.bdia.model.Book;
import com.example.bdia.model.dto.CreateBookDto;
import com.example.bdia.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorService authorService;

    public Book createBook(CreateBookDto createBookDto) {

        Book book = new Book();

        book.setTitle(createBookDto.getTitle());

        if (createBookDto.getAuthor().getId() != null) {
            book.setAuthor(authorService.findAuthor(createBookDto.getAuthor().getId()));
        } else {
            book.setAuthor(authorService.createAuthor(createBookDto.getAuthor()));
        }

        book.setTitle(createBookDto.getIsbn());
        book.setPublicationYear(createBookDto.getPublicationYear());
        book.setPublisher(createBookDto.getPublisher());
        book.setGenre(createBookDto.getGenre());
        book.setDescription(createBookDto.getDescription());
        book.setPrice(createBookDto.getPrice());
        book.setLanguage(createBookDto.getLanguage());
        book.setNumberOfPages(createBookDto.getNumberOfPages());

        return bookRepository.save(book);
    }

}
