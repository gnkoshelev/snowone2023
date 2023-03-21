package ru.gnkoshelev.snowone2023._03;

/**
 * Slide 2: Illustrate broken inheritance with extended class model.
 */
public class ExtendedExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal hyena = new Hyena();
        System.out.println("Dog: " + dog.talk());
        System.out.println("Cat: " + cat.talk());
        System.out.println("Hyena: " + hyena.talk());
    }

    public abstract static class Animal {
        public abstract String talk();
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
        @Override
        public String talk() {
            return bark();
        }

        public abstract String bark();
    }

    public abstract static class Feliformia extends Carnivora {
        @Override
        public String talk() {
            return meow();
        }

        public abstract String meow();
    }

    public static class Dog extends Caniformia {
        public String bark() {
            return "Гав!";
        }
    }

    public static class Cat extends Feliformia {
        public String meow() {
            return "Мяу!";
        }
    }

    public static class Hyena extends Feliformia {
        public String bark() {
            return "Ай!";
        }

        /**
         * Oops: got broken inheritance.
         * Use inheritance if and only if inheritors specialization was proven.
         * Otherwise, use composition to avoid broken inheritance.
         *
         * @return actually returns Hyena's barking
         */
        @Override
        public String meow() {
            return bark();
        }
    }
}
