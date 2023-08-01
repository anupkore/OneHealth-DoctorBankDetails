package com.oneHealth.DoctorBankDetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception class for representing the scenario when a profile is not found in the application.
 * This exception is annotated with @ResponseStatus, indicating that it will trigger a 404 NOT_FOUND response
 * when thrown.
 * @author Anup
 * @version 3.9.10
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProfileNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for creating a new instance of ProfileNotFoundException with a custom error message.
     *
     * @param message The error message indicating the reason for the exception.
     */
    public ProfileNotFoundException(String message) {
        super(message);
    }
}
