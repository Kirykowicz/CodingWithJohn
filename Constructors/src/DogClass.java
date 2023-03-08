public class DogClass {
    String name;
    int age; 
    String breed;
    String color;
    int numberOfLegs;

    public DogClass(String name, int age, String breed, String color){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.numberOfLegs = 4;
    }

    public void bark(){
        System.out.println("Bark! my name is " + this.name);
    }

    public void PrintDog(){
        System.out.println("\nname: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("breed: " + this.breed);
        System.out.println("color: " + this.color);
        System.out.println("numberOfLegs: " + this.numberOfLegs + "\n");
    }
}
