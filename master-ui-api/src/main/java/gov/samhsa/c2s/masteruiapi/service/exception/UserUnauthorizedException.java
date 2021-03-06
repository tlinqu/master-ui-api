package gov.samhsa.c2s.masteruiapi.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class UserUnauthorizedException extends RuntimeException {
    public UserUnauthorizedException() {
        super();
    }

    public UserUnauthorizedException(String message) {
        super(message);
    }
}
