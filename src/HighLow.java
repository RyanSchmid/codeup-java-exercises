import java.util.Scanner;

public class HighLow {
    public static void highLow() {

        // Game Development 101: You are going to build a high-low guessing game.
        // Create a class named HighLow inside of src.
        // Game picks a random number between 1 and 100.
        // Prompts user to guess the number
        // All user inputs are validated
        // If user's guess is less than the number, it outputs "HIGHER"
        // If user's guess is more than the number, it outputs "LOWER"
        // If a user guesses the number, the game should declare "GOOD GUESS!"
        int randomNumber = (int) Math.floor(java.lang.Math.random() * 100);

//        System.out.println("Guess a number between 1 & 100");
//        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("Guess a number between 1 & 100");
            Scanner nextinput = new Scanner(System.in);
            input = nextinput.nextInt();
            if (randomNumber > input) {
                System.out.println("HIGHER");
            }

            if (randomNumber < input) {
                System.out.println("LOWER");
            }
        } while (input != randomNumber);

        System.out.println("GOOD GUESS");
    }

    public static void main(String[] args) {
        highLow();
    }
}
