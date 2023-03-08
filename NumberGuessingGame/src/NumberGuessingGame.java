import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Enter your guess");
        int userSelection = scanner.nextInt();

        while(userSelection != randomNumber){
            if(userSelection > randomNumber){
                System.out.println("Too high!");
                userSelection = scanner.nextInt();
            }else{
                System.out.println("Too low!");
                userSelection = scanner.nextInt();
            }
        }
        System.out.println("You guessed correctly! The random number was: " + randomNumber + "\n");
    }
}
