package org.sergei.exceptions;

/**
 * @author Sergei Visotsky
 */
public class CheckedException extends Exception {
   
    private static final long serialVersionUID = 1L;

    public CheckedException(String message) {
        super(message);
    }
}
