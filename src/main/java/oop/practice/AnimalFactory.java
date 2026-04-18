package oop.practice;

public class AnimalFactory {

    public static Animal create(String type, String name) {

        return switch (type.toLowerCase()) {
            case "cat" -> new Cat.Builder().name(name).build();
            case "dog" -> new Dog.Builder().name(name).build();
            default -> throw new IllegalArgumentException("Invalid animal type: " + type);
        };
    }
}
