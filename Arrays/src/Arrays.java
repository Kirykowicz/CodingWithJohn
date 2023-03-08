public class Arrays {
    public static void main(String[] args){
        
        String[] cars = {"Toyota", "honda", "chevrolet", "ford"};
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        for(String car : cars){
            System.out.println("Car: " + car);
        }

    }
}
