package ru.gnkoshelev.snowone2023._07;

import org.jetbrains.annotations.NotNull;

public class RecordResultProcess {
    public static RecordResult<String, String> process(boolean result) {
        if (result) {
            return RecordResult.of("result");
        }
        return RecordResult.ofError("error");
    }

    public record RecordResult<D, E>(D data, E error) {
        public static <D, E> RecordResult<D, E> of(@NotNull D data) {
            return new RecordResult<>(data, null);
        }

        public static <D, E> RecordResult<D, E> ofError(@NotNull E error) {
            return new RecordResult<>(null, error);
        }
    }
}
