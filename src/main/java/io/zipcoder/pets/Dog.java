package io.zipcoder.pets;

public class Dog extends Pet{

    public Dog(){
        super();
    }

    public Dog(int age){
        super(age);
    }

    public Dog(String name){
        super(name);
    }

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public String speak(){
        return "Woof!";
    }
}
