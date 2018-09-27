package util;

import java.util.Scanner;

public class Input {

    private Scanner scan;

    //constructor to build scanner for each input; runs whenever we see new Input()    //
    public Input() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        String input = scan.nextLine();
//        System.out.println(input);
        return input;
    }

    public boolean yesNo() {
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else return false;
    }

    public int getInt() {
        int input = scan.nextInt();
        System.out.println(input);
        return input;
    }

    public int getInt(int min, int max) {
        int input = scan.nextInt();
        if (input < min || input > max) {
            System.out.println("enter a number between " + min + " and " + max);
            getInt(min, max);
        }
        return input;
    }

    public double getDouble() {
        double input = scan.nextDouble();
        System.out.println(input);
        return input;
    }

    public double getDouble(double min, double max) {
        double input = scan.nextDouble();
        if (input < min || input > max) {
            System.out.println("enter a number between " + min + " and " + max);
            getDouble(min, max);
        }
        return input;
    }


    // Allow all of your methods for getting input to accept an optional
    // string parameter named "prompt". If passed, the method should
    // show the given prompt to the user before parsing the input.


    public static void main(String[] args) {

    }


}
