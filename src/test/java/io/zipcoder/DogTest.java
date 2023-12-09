package io.zipcoder;

import io.zipcoder.pets.Dog;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testDogConstructor(){
        Dog dog = new Dog();

        Assert.assertNotNull(dog);
    }

    @Test
    public void testDogConstructorAge(){
        String name = "No name";
        int age = 7;
        Dog dog = new Dog(age);

        Assert.assertEquals(age, dog.getAge());
        Assert.assertEquals(name, dog.getName());
    }

    @Test
    public void testDogConstructorName(){
        String name = "Dasi";
        int age = 0;
        Dog dog = new Dog(name);

        Assert.assertEquals(name, dog.getName());
    }

    @Test
    public void testDogConstructorAgeName(){
        String name = "Dasi";
        int age = 6;
        Dog dog = new Dog(name, age);

        Assert.assertEquals(name, dog.getName());
        Assert.assertEquals(age, dog.getAge());
    }

    @Test
    public void testDogSpeak(){
        Dog dog = new Dog();

        String actual = dog.speak();

        Assert.assertEquals("Woof!", actual);
    }
}
