package org.example;

import org.example.Animals.Animal;
import org.example.Animals.Cat;
import org.example.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobic");
        dog.run(501);
        dog.run(25);
        dog.swim(20);
        dog.swim(10);

        System.out.println();

        Cat cat = new Cat("Pushok");
        cat.swim(1);

        System.out.println();

        Animal[] animals = new Animal[10];
        animals[0] = new Dog("Barbos");
        animals[1] = new Cat("Ryzhik");
        animals[2] = new Dog("Sharik");
        animals[3] = new Dog("Doggy");
        animals[4] = new Cat("Chernysh");
        animals[5] = new Cat("Matilda");
        animals[6] = new Dog("Dux");
        animals[7] = new Dog("Rex");

        System.out.println();

        animals[0].getAnimalScore();
        cat.getCatScoretScore();
        dog.getDogScore();
    }
}
