package defaultinterfaces;
public class InterfaceExample {
    public static void main(String[] args) {
        Cat puzo = new Cat(2, "Puzo");
        System.out.println(puzo.toString());
        puzo.makeNoise();

        Car myCar = new Car();
        myCar.makeNoise();
    }
}
