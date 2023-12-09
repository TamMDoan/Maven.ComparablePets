package io.zipcoder;

import io.zipcoder.pets.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testCatConstructor(){
        Cat cat = new Cat();

        Assert.assertNotNull(cat);
    }

    @Test
    public void testCatConstructorAge(){
        int age = 5;
        Cat cat = new Cat(age);

        Assert.assertEquals(age, cat.getAge());
    }

    @Test
    public void testCatConstructorName(){
        String name = "Ace";
        Cat cat = new Cat(name);

        Assert.assertEquals(name, cat.getName());
    }

    @Test
    public void testCatConstructorNameAge(){
        String name = "Ace";
        int age = 5;
        Cat cat = new Cat(name, age);

        Assert.assertEquals(name, cat.getName());
        Assert.assertEquals(age, cat.getAge());
    }

    @Test
    public void testCatSpeak(){
        Cat cat = new Cat();

        String actual = cat.speak();

        Assert.assertEquals("Meow!", actual);
    }
}
