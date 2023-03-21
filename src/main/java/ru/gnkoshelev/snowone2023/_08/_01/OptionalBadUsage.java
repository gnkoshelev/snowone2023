package ru.gnkoshelev.snowone2023._08._01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Use {@link Collections#emptyList()} instead of {@link Optional#empty()}.
 */
public class OptionalBadUsage {
    /**
     * Optional bad usage example.
     *
     * @return optional of list
     */
    public static Optional<List<Object>> findAll() {
        int count = 0;
        List<Object> result = new ArrayList<>();
        /* Try to find some elements */
        if (count != 0) {
            return Optional.of(result);
        }
        return Optional.empty();// No elements are found
    }

    public static void main(String[] args) {
        Optional<List<Object>> result = findAll();
        result.ifPresent(objects -> objects.forEach(x -> {
            /* consume elements */
        }));
    }
}
