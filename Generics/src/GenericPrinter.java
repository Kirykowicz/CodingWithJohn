import java.io.Serializable;

public class GenericPrinter<T extends Animal, V> {

    T thingToPrint;
    V someOtherThing;

    public GenericPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
}
