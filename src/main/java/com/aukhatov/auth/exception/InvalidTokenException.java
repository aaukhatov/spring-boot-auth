package com.aukhatov.auth.exception;

import org.springframework.http.HttpStatus;

public class InvalidTokenException extends RuntimeException {

	private final String message;
	private final HttpStatus httpStatus;

	public InvalidTokenException(String message, HttpStatus httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}
