package org.sergei.exceptions;

public class ArithmeticException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ArithmeticException() {
        super();
    }

    public ArithmeticException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArithmeticException(String message) {
        super(message);
    }

    public ArithmeticException(Throwable cause) {
        super(cause);
    }
}
