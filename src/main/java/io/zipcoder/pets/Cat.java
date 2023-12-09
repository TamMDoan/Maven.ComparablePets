package io.zipcoder.pets;

public class Cat extends Pet{

    public Cat(){
        super();
    }

    public Cat(int age){
        super(age);
    }

    public Cat(String name){
        super(name);
    }

    public Cat(String name, int age){
        super(name, age);
    }



    @Override
    public String speak(){
        return "Meow!";
    }
}
