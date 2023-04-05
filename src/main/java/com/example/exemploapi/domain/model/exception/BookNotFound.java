package com.example.exemploapi.domain.model.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BookNotFound extends RuntimeException {

    public BookNotFound(String message) {
        super(message);
    }

}
