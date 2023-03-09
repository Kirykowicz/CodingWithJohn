import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        GenericPrinter<Cat, Cat> printer = new GenericPrinter<>(new Cat("Puzo the cat"));
        printer.print();

        GenericPrinter<Dog, Cat> doublePrinter = new GenericPrinter<>(new Dog("Ernie the dog"));
        doublePrinter.print();

        ArrayList<Animal> cats = new ArrayList<>();
        cats.add(new Cat("Pearl the cat"));

        Cat myCat = (Cat)cats.get(0);
        System.out.println(myCat);

        shout(myCat, " Cool isnt it");
        shout(34, " Cat");
        shout("This can take any type because it is generic", 1);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);
    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout){
        System.out.println(thingToShout + "!!!!");
        System.out.println("_______" + otherThingToShout);
    }

    private static void printList(List<?> myLIst){
        System.out.println(myLIst);
    }
}
