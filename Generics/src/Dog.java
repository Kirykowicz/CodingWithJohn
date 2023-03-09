public class Dog extends Animal{

    int walkDistancePreference;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void eat() {
        System.out.println("Chomp Chomp Chomp");
    }

    @Override
    public String toString() {
        return "My name is " + super.name;
    }
}
