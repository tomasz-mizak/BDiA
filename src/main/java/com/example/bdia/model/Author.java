package com.example.bdia.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Author extends AbstractEntity {

    private String firstName;
    private String secondName;
    private String familyName;

}
