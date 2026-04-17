package oop.practice;

public abstract class Animal {
    public Animal(String name) {
        this.name = name;
    }

    private String name;

    public abstract void speak();

    public void breath() {
        System.out.println("breath....");
    }
}
