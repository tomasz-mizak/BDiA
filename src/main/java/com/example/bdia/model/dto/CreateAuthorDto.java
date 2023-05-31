package com.example.bdia.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class CreateAuthorDto {
    @NotNull
    @Size(min = 3, max = 32)
    private String firstName;
    private String secondName;
    @NotNull
    @Size(min = 3, max = 32)
    private String familyName;
}
