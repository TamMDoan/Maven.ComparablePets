package io.zipcoder.pets;

public class Pet implements Comparable<Pet>{
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

    @Override
    public int compareTo(Pet o) {
        if(this.getName().equals(o.getName())){
            // break tie
            Dog dog = new Dog();
            Cat cat = new Cat();
            if(this.getClass().equals(o.getClass())){
                return 0;
            }
            else if(this.getClass().equals(dog.getClass())){
                return 1;
            }
            else if(this.getClass().equals(cat.getClass())){
                return -1;
            }
            else{
                return -1;
            }
        }

        for(int i = 0; i < this.getName().length(); i++) {
            if (this.getName().charAt(i) > o.getName().charAt(i)){
                return 1;
            }
            else if(this.getName().charAt(i) < o.getName().charAt(i)){
                break;
            }
        }
        return -1;
    }
}
