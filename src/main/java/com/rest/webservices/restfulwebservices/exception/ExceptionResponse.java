package com.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse {
    private final Date timeStamp;
    private final String message;
    private final String details;

    public ExceptionResponse(Date timeStamp, String message, String details) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
