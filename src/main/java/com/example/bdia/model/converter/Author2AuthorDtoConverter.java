package com.example.bdia.model.converter;

import com.example.bdia.model.Author;
import com.example.bdia.model.dto.AuthorDto;
import org.springframework.core.convert.converter.Converter;

public class Author2AuthorDtoConverter implements Converter<Author, AuthorDto> {
    @Override
    public AuthorDto convert(Author source) {
        return AuthorDto.builder()
                .id(source.getId())
                .firstName(source.getFirstName())
                .secondName(source.getSecondName())
                .familyName(source.getFamilyName())
                .build();
    }
}
