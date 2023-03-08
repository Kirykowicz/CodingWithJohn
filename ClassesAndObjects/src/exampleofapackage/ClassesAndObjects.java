package exampleofapackage;

import animals.Dog;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("Ralphy");
        myDog.setBreed("lab");
        myDog.setAge(3);
        myDog.setColor("brown");
        myDog.bark();

        Dog yourDog = new Dog();
        yourDog.setName("Buck");
        yourDog.setColor("Rainbow");
        yourDog.setBreed("Retriever");
        yourDog.bark();

        
        System.out.println("Dog count: " + Dog.dogCount);
        Dog.printDogCount();
        
    }
}
