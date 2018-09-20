import java.util.Scanner;

public class MethodsExercises{


    // #1 ARITHMETIC. Create four separate methods. Each will perform an arithmetic operation
    // Each function needs to take two parameters/arguments so that the operation can be performed.

    // Addition
    public static int addition(int a, int b) {
        int addResult = a + b;
        return addResult;
    }

    // Subtraction
    public static int subtraction(int c, int d) {
        int subResult = c - d;
        return subResult;
    }

    // Multiplication
    // Create your multiplication method without the * operator (Hint: a loop might be helpful).
    // Do the above with recursion.

    public static int multiplication(int e, int f) {
        int multResult = e * f;
        return multResult;
    }

    public static int multiplication2(int y, int z) {
        int initialValue = y;
        do {
            initialValue += y;
            z--;
        } while (z > 1);
        return initialValue;
    }


    // Division
    public static int division(int g, int h) {
        int divResult = g / h;
        return divResult;
    }

    // Add a modulus function that finds the modulus of two numbers.

    public static int modulus(int num1, int num2){
        int modResult = num1 % num2;
        return modResult;
    }


    // #2 NUMBER RANGE: Create a method that validates that user input is in a certain range
    // If the input is invalid, prompt the user again. Hint: recursion might be helpful here!

        public static void getInteger(int min, int max) {
            System.out.print("Enter a number between " + min + " and " + max+": ");
            Scanner scanner = new Scanner(System.in);
            int userNumber = scanner.nextInt();
            if (userNumber > max || userNumber < min) getInteger(min, max);
            System.out.println("You entered: " + userNumber + " which is between " + min + " and " + max);
        }
        //int userInput = getInteger(1, 10);

    // #3 FACTORIAL: Calculate the factorial of a number.
    // Prompt the user to enter an integer from 1 to 10.
    // Display the factorial of the number entered by the user.
    // Ask if the user wants to continue.
    // Use a for loop to calculate the factorial.
    // Assume that the user will enter an integer, but verify it’s between 1 and 10.
    // Use the long type to store the factorial.
    // Continue only if the user agrees to.
    // A factorial is a number multiplied by each of the numbers before it.
    // Factorials are denoted by the exclamation point (n!). Ex:

    public static void factorial(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter an integer between 1 and 10");
            long input = scanner.nextInt();
            long output = 0;
            if (input<1){
                System.out.println(output);
            }
            if (input > 10) System.out.println("Enter an integer between 1 and 10");
            output = input;
            for(long i = output-1; i > 0; --i){
                output *= i;
            }
        System.out.println(input +"! = "+ output);


        }





    // DICE ROLLING: Create an application that simulates dice rolling.
    // Ask the user to enter the number of sides for a pair of dice.
    // Prompt the user to roll the dice.
    // "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //  Use static methods to implement the method(s) that generate the random numbers.
    // Use the .random method of the java.lang.Math class to generate random numbers.

    public static void diceRoll(int sidesOnDice){
        System.out.println("Hit enter to roll the dice (OR) type any letter and hit enter to exit");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            int roll1 = (int) Math.floor(java.lang.Math.random() * sidesOnDice);
            int roll2 = (int) Math.floor(java.lang.Math.random() * sidesOnDice);
            System.out.println("You rolled a " + roll1 + " and a " + roll2);
            diceRoll(sidesOnDice);
        }
        else System.out.println("No dice roll for you.....");
    }


    // Game Development 101: Go to HighLow class for exercise


    public static void main(String[] args) {
        System.out.println(multiplication2(6,7));
        System.out.println(modulus(9, 2));
//        getInteger(0, 12);
//        diceRoll(6);
        factorial();

    }
}

