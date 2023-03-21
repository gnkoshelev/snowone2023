package ru.gnkoshelev.snowone2023._08._03;

import java.util.Objects;

public class WrongNullCheck {
    public static void main(String[] args) {
        Object object = null;
        if (object != null) {
            /* process */
        }

        if (Objects.nonNull(object)) {
            /* process */
        }
    }
}
