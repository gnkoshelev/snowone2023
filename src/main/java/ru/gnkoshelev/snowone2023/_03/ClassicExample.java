package ru.gnkoshelev.snowone2023._03;

/**
 * Slide 1
 */
public class ClassicExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.println("Dog: " + dog.talk());
        System.out.println("Cat: " + cat.talk());
    }

    public abstract static class Animal {
        public abstract String talk();
    }

    public static class Dog extends Animal {
        @Override
        public String talk() {
            return bark();
        }

        protected String bark() {
            return "Гав!";
        }
    }

    public static class Cat extends Animal {
        @Override
        public String talk() {
            return meow();
        }

        protected String meow() {
            return "Мяу!";
        }
    }
}
