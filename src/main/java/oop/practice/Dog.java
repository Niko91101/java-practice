package oop.practice;

public class Dog extends Animal implements Trainable {

    private Dog(Builder builder) {
        super(builder.name);
    }

    public static class Builder {
        private String name;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Animal build() {
            return new Dog(this);
        }
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
