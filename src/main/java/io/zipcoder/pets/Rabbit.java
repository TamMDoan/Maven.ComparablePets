package io.zipcoder.pets;

public class Rabbit extends Pet{

    public Rabbit(){
        super();
    }

    public Rabbit(int age){
        super(age);
    }

    public Rabbit(String name){
        super(name);
    }

    public Rabbit(String name, int age){
        super(name, age);
    }

    @Override
    public String speak(){
        return "Mmmm";
    }
}
