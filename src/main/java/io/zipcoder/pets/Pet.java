package io.zipcoder.pets;

public class Pet {
    private String name;
    private int age;

    public Pet(){
        this.name = "No name";
        this.age = 0;
    }

    public Pet(String name){
        this.name = name;
        this.age = 0;
    }

    public Pet(int age){
        this.name = "No name";
        this.age = age;
    }

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String speak(){
        return "Speeeeak";
    }
}
