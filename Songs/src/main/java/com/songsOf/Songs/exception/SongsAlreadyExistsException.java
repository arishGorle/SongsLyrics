package com.songsOf.Songs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class SongsAlreadyExistsException extends RuntimeException {

    public SongsAlreadyExistsException(String message) {
        super(message);
    }

}