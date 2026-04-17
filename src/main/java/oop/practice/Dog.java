package oop.practice;

public class Dog extends Animal implements Trainable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void train() {
        System.out.println("Dog train");
    }

    @Override
    public void speak() {
        System.out.println("I am Dog");
    }
}
