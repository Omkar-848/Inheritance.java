package Inheritance;

public class Hierarchical {

    // Parent class
    static class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    // Child class 1
    static class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }

    // Child class 2
    static class Cat extends Animal {
        void meow() {
            System.out.println("The cat meows.");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
