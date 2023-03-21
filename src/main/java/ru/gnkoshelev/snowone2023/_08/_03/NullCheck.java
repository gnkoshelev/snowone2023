package ru.gnkoshelev.snowone2023._08._03;

import java.util.Objects;

public class NullCheck {
    public record Container<T>(T value) {
        public Container(T value) {
            this.value = Objects.requireNonNull(value, "The value MUST not be null");
        }
    }

    /**
     * Throws NPE since use {@link Objects#requireNonNull(Object, String)} to validate
     * record's constructor parameter.
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        Container<Object> container = new Container<>(null);
    }
}
