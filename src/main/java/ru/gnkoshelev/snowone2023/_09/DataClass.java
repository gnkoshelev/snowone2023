package ru.gnkoshelev.snowone2023._09;

public class DataClass {
    public record ImmutableDataClass(String foo, String bar) {

    }

    public static void main(String[] args) {
        ImmutableDataClass obj = new ImmutableDataClass("foo", "bar");
        System.out.println(obj.foo() + " and " + obj.bar());
    }
}
