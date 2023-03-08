import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int age = input.nextInt();

        System.out.println("Your age is " + age);

        if(age < 18){
            System.out.println("You're not old enough to smoke");
        }else if (age < 21){
            System.out.println("You can smoke, but can't drink");
        } else if(age < 60){
            System.out.println("You can drink and smoke but are not a senior citizen");
        } else {
            System.out.println("You are old and can do whatever you want!");
        }
    }
}