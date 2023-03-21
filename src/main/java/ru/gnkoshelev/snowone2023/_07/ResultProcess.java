package ru.gnkoshelev.snowone2023._07;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ResultProcess {
    public static Result<String, String> process(boolean result) {
        if (result) {
            return Result.of("result");
        }
        return Result.ofError("error");
    }

    public static class Result<D, E> {
        private final D data;
        private final E error;

        private Result(@Nullable D data, @Nullable E error) {
            this.data = data;
            this.error = error;
        }

        public D data() {
            return data;
        }

        public E error() {
            return error;
        }

        public static <D, E> Result<D, E> of(@NotNull D data) {
            return new Result<>(data, null);
        }

        public static <D, E> Result<D, E> ofError(@NotNull E error) {
            return new Result<>(null, error);
        }
    }
}
