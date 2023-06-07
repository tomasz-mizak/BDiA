package com.example.bdia.service;

import com.example.bdia.exception.ResourceNotFoundException;
import com.example.bdia.model.Author;
import com.example.bdia.model.dto.AuthorDto;
import com.example.bdia.model.dto.CreateAuthorDto;
import com.example.bdia.repository.AuthorRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public Author createAuthor(CreateAuthorDto createAuthorDto) {

        Author author = new Author();
        author.setFirstName(createAuthorDto.getFirstName());
        author.setSecondName(createAuthorDto.getSecondName());
        author.setFamilyName(createAuthorDto.getFamilyName());

        return authorRepository.save(author);
    }

    @Transactional
    public Author createAuthor(AuthorDto authorDto) {
        if (authorDto.getFirstName() == null) throw new IllegalArgumentException("AUTHOR_FIRST_NAME_REQUIRED");
        if (authorDto.getFamilyName() == null) throw new IllegalArgumentException("AUTHOR_FAMILY_NAME_REQUIRED");
        Author author = new Author();
        author.setFirstName(author.getFirstName());
        author.setSecondName(author.getSecondName());
        author.setFamilyName(author.getFamilyName());
        return authorRepository.save(author);
    }

    public Author findAuthor(Long id) {
        Optional<Author> optional = authorRepository.findById(id);
        if (optional.isPresent()) return optional.get();
        throw new ResourceNotFoundException("AUTHOR_NOT_FOUND");
    }

}
