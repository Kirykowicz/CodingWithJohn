import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        String name;
        int age; 
        float shoeSize;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your name:");
        name = userInput.nextLine();
        System.out.println(name);
        System.out.println("How old are you?");
        age = userInput.nextInt();
        System.out.println("age: " + age);
        System.out.println("What is your shoe size?");
        shoeSize = userInput.nextFloat();
        System.out.println("Your shoe size is " + shoeSize);
        
    }
}
