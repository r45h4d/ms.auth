package az.ingress.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public enum ExceptionConstants {
    USER_NOT_FOUND("USER_NOT_FOUND","User not found"),
    METHOD_NOT_ALLOWED("METHOD_NOT_ALLOWED","Method not allowed"),
    UNEXPECTED_EXCEPTION("UNEXPECTED_EXCEPTION", "Unexpected exception occured");

    private final String code;
    private final String message;
}
