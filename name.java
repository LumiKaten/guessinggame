import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);  

        Scanner scan = new Scanner(System.in);
        int guess;
        int guessCount = 0;
        boolean guessedCorrectly = false;

        do {
            System.out.println("Enter your guess:");
            guess = scan.nextInt();
            guessCount++;

            if (guess < x) {
                System.out.println("Too low!");
            } else if (guess > x) {
                System.out.println("Too high!");
            } else {
                guessedCorrectly = true;
            }
        } while (!guessedCorrectly && guessCount < 7);

        // Final message based on guessCount
        if (guessedCorrectly) {
            if (guessCount <= 7) {
                System.out.println("You got an impossibly good score!");
            } else if (guessCount <= 10) {
                System.out.println("You did a good job!");
            }
        } else if (guessCount >= 10) {
            System.out.println("you will never succeed in life!");
        }
        
        scan.close(); // Close the scanner to prevent resource leak
    }
}
