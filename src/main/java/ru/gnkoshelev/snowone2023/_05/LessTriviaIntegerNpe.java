package ru.gnkoshelev.snowone2023._05;

public class LessTriviaIntegerNpe {
    private static class IntegerContainer {
        private Integer value;// It was 'int' before "refactoring" and worked fine
    }

    public static void main(String[] args) {
        IntegerContainer container = new IntegerContainer();
        if (container.value == 0) {// Will get a NPE
            System.out.println("Value is 0");
        }
    }
}
