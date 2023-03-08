import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsStuff {
    public static void main(String[] args){
       List<String> names = new ArrayList<>();
       names.add("Zebra");
       names.add("Robert");
       names.add("George");
       names.add("Kramer");
       names.set(1, "Elaine");
       System.out.println(names);
       Collections.sort(names);
       System.out.println(names);
       Collections.reverse(names);
       System.out.println(names);
    }
}
