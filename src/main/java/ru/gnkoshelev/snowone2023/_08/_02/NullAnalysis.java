package ru.gnkoshelev.snowone2023._08._02;

import org.jetbrains.annotations.NotNull;

public class NullAnalysis {
    public static class Container<T> {
        private final T value;

        // IDEA highlights @NotNull violation here too:
        public Container(@NotNull T value) {
            this.value = value;
        }

        @NotNull
        public T value() {
            return value;
        }
    }

    public static void main(String[] args) {
        // IDEA highlights @NotNull violation:
        Container<Object> container = new Container<>(null);
    }
}
