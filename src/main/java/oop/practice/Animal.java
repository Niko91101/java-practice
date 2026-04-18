package oop.practice;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void speak();

    public void breath() {
        System.out.println("breath....");
    }
}
