package com.example.bdia.model.dto;

public class ErrorMessageDto {

    private Integer status;
    private String message;

    public ErrorMessageDto(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

}
