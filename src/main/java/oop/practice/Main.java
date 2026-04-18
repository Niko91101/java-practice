package oop.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal animal = AnimalFactory.create("dog", "Archi");
        Animal animal2 = AnimalFactory.create("cat", "Alisa");

        //Animal animal3 = AnimalFactory.create("dogg");

        List<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(animal2);
        //animals.add(animal3);


        for(Animal animalq : animals) {
            animalq.speak();
        }
    }
}


