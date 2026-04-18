package oop.practice;

public class Cat extends Animal {

    private Cat(Builder builder) {
        super(builder.name);
    }

    public static class Builder {
        private String name;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Cat build() {
            return new Cat(this);
        }
    }

    @Override
    public void speak() {
        System.out.println("cat speak");
    }
}
