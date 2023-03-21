package ru.gnkoshelev.snowone2023._07;

public class ExceptionalProcess {
    public static String process(boolean result) {
        if (result) {
            return "result";
        }
        throw new ResultException("error");
    }

    public static class ResultException extends RuntimeException {
        public ResultException(String message) {
            super(message);
        }
    }
}
