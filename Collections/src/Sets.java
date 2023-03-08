import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Jerry");
        names.add("George");
        names.add("Kramer");
        names.add("Elaine");
        names.add("Elaine");
        System.out.println(names);
    }
}
