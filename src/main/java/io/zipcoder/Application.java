package io.zipcoder;


import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import io.zipcoder.pets.Rabbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args){
        List<Pet> pets = new ArrayList<>();
        Cat cat = new Cat("Tam");
        Cat cat2 = new Cat("Alex");
        Dog dog = new Dog("Brian");
        Dog dog2 = new Dog("Alex");
        Rabbit rabbit = new Rabbit("Wendy");
        Rabbit rabbit2 = new Rabbit("Ron");
        Dog dog3 = new Dog("Ron");

        pets.add(cat);
        pets.add(dog);
        pets.add(rabbit);
        pets.add(dog2);
        pets.add(rabbit2);
        pets.add(cat2);
        pets.add(dog3);

        Collections.sort(pets);

        System.out.println(pets);



    }
}
