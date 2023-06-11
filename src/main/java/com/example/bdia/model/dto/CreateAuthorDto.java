package com.example.bdia.model.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CreateAuthorDto {

    @Size(min = 4, max = 64)
    private String firstName;

    private String secondName;

    @Size(min = 4, max = 64)
    private String familyName;
}
