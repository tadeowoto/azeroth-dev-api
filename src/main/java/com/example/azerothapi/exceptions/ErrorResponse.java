package com.example.azerothapi.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResponse {

    private String message, errorDetails;
    private int statusCode;
    private LocalDateTime timestamp;

    public ErrorResponse(int statusCode, String errorDetails, String message) {
        this.statusCode = statusCode;
        this.errorDetails = errorDetails;
        this.message = message;
        timestamp = LocalDateTime.now();
    }
}
