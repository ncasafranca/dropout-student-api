package com.tesis.dropout_student_api.exception;

public class UnKnownException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public UnKnownException(String msg) {
        super(msg);
    }
}
