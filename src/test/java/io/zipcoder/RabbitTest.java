package io.zipcoder;

import io.zipcoder.pets.Rabbit;
import org.junit.Assert;
import org.junit.Test;

public class RabbitTest {

    @Test
    public void testRabbitConstructor(){
        Rabbit rabbit = new Rabbit();

        Assert.assertNotNull(rabbit);
    }

    @Test
    public void testRabbitConstructorAge(){
        int age = 3;
        Rabbit rabbit = new Rabbit(age);

        Assert.assertEquals(age, rabbit.getAge());
    }

    @Test
    public void testRabbitConstructorName(){
        String name = "Loo";
        Rabbit rabbit = new Rabbit(name);

        Assert.assertEquals(name, rabbit.getName());
    }

    @Test
    public void testRabbitConstructorNameAge(){
        String name = "Loo";
        int age = 3;
        Rabbit rabbit = new Rabbit(name, age);

        Assert.assertEquals(name, rabbit.getName());
        Assert.assertEquals(age, rabbit.getAge());
    }

    @Test
    public void testRabbitSpeak(){
        Rabbit rabbit = new Rabbit();

        String actual = rabbit.speak();

        Assert.assertEquals("Mmmm", actual);
    }
}
