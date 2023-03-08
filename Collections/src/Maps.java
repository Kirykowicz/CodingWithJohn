import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(12345, "John");
        employees.put(54321, "George");
        employees.put(11111, "Kramer");
        employees.put(22222, "Newman");
        System.out.println(employees);
    }
}
