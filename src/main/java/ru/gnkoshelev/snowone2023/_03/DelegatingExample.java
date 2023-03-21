package ru.gnkoshelev.snowone2023._03;

/**
 * Slide 3: Delegate {@link Animal#talk()} implementation for the {@link Dog} and the {@link Cat}
 * to interfaces {@link Barkable} and {@link Meowable}.
 */
public class DelegatingExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal hyena = new Hyena();
        System.out.println("Dog: " + dog.talk());
        System.out.println("Cat: " + cat.talk());
        System.out.println("Hyena: " + hyena.talk());
    }

    public interface Talkable {
        String talk();
    }

    public abstract static class Animal implements Talkable {
    }

    public abstract static class Mammal extends Animal {
        public void drinkMilk() {
        }
    }

    public abstract static class Carnivora extends Mammal {
        public void eatFlesh() {
        }
    }

    public abstract static class Caniformia extends Carnivora {
    }

    public abstract static class Feliformia extends Carnivora {
    }

    interface Barkable extends Talkable {
        @Override
        default String talk() {
            return bark();
        }

        String bark();
    }

    interface Meowable extends Talkable {
        default String talk() {
            return meow();
        }

        String meow();
    }

    public static class Dog extends Caniformia implements Barkable {
        public String bark() {
            return "Гав!";
        }
    }

    public static class Cat extends Feliformia implements Meowable {
        public String meow() {
            return "Мяу!";
        }
    }

    public static class Hyena extends Feliformia implements Barkable {
        public String bark() {
            return "Ай!";
        }
    }
}
