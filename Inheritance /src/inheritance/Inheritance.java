package inheritance;

import animalsanimals.Animal;
import animalsanimals.Cat;
import animalsanimals.Dog;

public class Inheritance {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.bark();
        myDog.setName("Rufus");
        myDog.eat();

        Cat myCat = new Cat();
        myCat.eat();
    }
}
