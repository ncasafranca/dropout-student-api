package com.tesis.dropout_student_api.exception;

public class UserNotFound extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UserNotFound(String msg) {
        super(msg);
    }
}
