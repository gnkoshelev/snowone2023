package ru.gnkoshelev.snowone2023._05;

public class IntegerUsage {
    public static void main(String[] args) {
        Integer integer = 5;// Auto-boxing
        System.out.println(integer);
        int i = integer;// Auto-unboxing
        System.out.println(i);
        integer = null;// Integer is nullable
        i = integer;// NPE
    }
}
