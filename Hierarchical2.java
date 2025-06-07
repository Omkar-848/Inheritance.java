package Inheritance;

public class Hierarchical2 {
    void eat() {
        System.out.println("eating...");
    }

    // Nested classes (e.g., Dog and Cat)
    static class Dog extends Hierarchical2 {
        void bark() {
            System.out.println("barking...");
        }
    }

    static class Cat extends Hierarchical2 {
        void meow() {
            System.out.println("meowing...");
        }
    }
}




