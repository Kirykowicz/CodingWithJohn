package animals;

import java.util.Objects;

public class Dog {
    public static int dogCount = 0;

    private int age; 
    private String name;
    private String breed;
    private String color;
    private int numberOfLegs;

    public Dog(){
        dogCount++;
        this.numberOfLegs = 4;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Dog other = (Dog)obj;

        return Objects.equals(this.getName(), other.getName()) && Objects.equals(this.getAge(), other.getAge());
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }    

    public static void printDogCount(){
        System.out.println("The total number of dogs is: " + dogCount);
    }

    public void bark(){
        System.out.println("Bark! My name is " + name);
    }

    @Override
    public String toString(){
        return "This is a " + this.age + " year old dog named " + this.name;
    }



}
