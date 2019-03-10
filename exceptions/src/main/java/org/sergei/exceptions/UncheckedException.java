package org.sergei.exceptions;

/**
 * @author Sergei Visotsky
 */
public class UncheckedException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public UncheckedException(String message) {
        super(message);
    }
}
