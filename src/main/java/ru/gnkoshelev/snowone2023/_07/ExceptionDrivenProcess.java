package ru.gnkoshelev.snowone2023._07;

public class ExceptionDrivenProcess {
    public static void process(boolean result) {
        if (result) {
            throw new SuccessException("result");
        }
        throw new ErrorException("error");
    }

    public static class SuccessException extends RuntimeException {
        public SuccessException(String message) {
            super(message);
        }
    }

    public static class ErrorException extends RuntimeException {
        public ErrorException(String message) {
            super(message);
        }
    }
}
