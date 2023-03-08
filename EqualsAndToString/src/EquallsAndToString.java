import animals.Dog;

public class EquallsAndToString {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        myDog.setName("John");
        myDog.setAge(1);

        Dog yourDog = new Dog();
        yourDog.setName("John");
        yourDog.setAge(2);

        if(myDog.equals(yourDog)){
            System.out.println("They are equall");
        } 
        else {
            System.out.println("They are not equall");
        }

        System.out.println(myDog.toString());
        System.out.println(yourDog.toString());
    }
}
