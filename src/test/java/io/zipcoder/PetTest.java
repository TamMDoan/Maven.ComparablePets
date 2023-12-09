package io.zipcoder;

import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void testPetContructorNull(){
        Pet pet = new Pet();

        Assert.assertNotNull(pet);

    }

    @Test
    public void testPetConstructorName(){
        String name = "Dasi";
        Pet pet = new Pet("Dasi");

        Assert.assertEquals(name, pet.getName());
    }

    @Test
    public void testPetConstructorAge(){
        int age = 7;
        Pet pet = new Pet(age);

        Assert.assertEquals(age, pet.getAge());
    }

    @Test
    public void testPetConstructorNameAndAge(){
        String name = "Dasi";
        int age = 7;
        Pet pet = new Pet(name, age);

        Assert.assertEquals(name, pet.getName());
        Assert.assertEquals(age, pet.getAge());
    }

    @Test
    public void testPetSpeak(){
        String name = "Dasi";
        int age = 7;
        Pet pet = new Pet(name, age);

        String expected = "Speeeeak";
        String actual = pet.speak();

        Assert.assertEquals(expected, actual);
    }
}
