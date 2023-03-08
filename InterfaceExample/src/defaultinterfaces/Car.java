package defaultinterfaces;

public class Car implements MakesNoise{

    @Override
    public void makeNoise() {
        System.out.println("Vroom vroom vroom");
    }
    
}
