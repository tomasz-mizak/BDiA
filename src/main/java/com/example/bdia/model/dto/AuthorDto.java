package com.example.bdia.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AuthorDto {

    private Long id;
    private String firstName;
    private String secondName;
    private String familyName;

}
