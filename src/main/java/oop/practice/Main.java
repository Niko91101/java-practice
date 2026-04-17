package oop.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Cat("Мявка"));
        animals.add(new Dog("Гавка"));
        animals.add(new Cat("Мявка"));
        animals.add(new Dog("Гавка"));
        animals.add(new Cat("Мявка"));
        animals.add(new Dog("Гавка"));

        for(Animal animal : animals) {
            animal.speak();
        }
    }
}


