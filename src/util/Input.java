package util;

import java.util.Scanner;

// create class out of Range Exception (no need to import Apache library)
class OutOfRangeException extends Exception{};


public class Input {


    private Scanner scan;

    //constructor to build scanner for each input; runs whenever we see new Input()    //
    public Input() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public boolean yesNo() {
        System.out.println("Please input yes or y to continue");
        String input = getString();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }

    public String getString() {
        return scan.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }


    public int getInt() {
        System.out.println("Please enter an integer:");
        int input;
        try{input = Integer.valueOf(getString());
        } catch (NumberFormatException e){
            System.out.println("Input is not a valid integer.");
            input = getInt();
        }
        System.out.println("You entered " + input);
        return input;
    }

    public int getInt(int min, int max) {
        System.out.println("enter a number between " + min + " and " + max);
        int input;
        try{
            input = Integer.valueOf(getString());
            if (input < min || input > max) throw new OutOfRangeException();
        }
        catch(NumberFormatException e) {
            System.out.println("Input is not valid.");
            input = getInt(min, max);
        }
        catch(OutOfRangeException e) {
            System.out.println("Input is not within valid range.");
            input = getInt(min, max);
        }
        System.out.println("You entered " + input);
        return input;
    }

    public double getDouble() {
        System.out.println("Please enter a double:");
        double input;
        try {
            input = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid double.");
            input = getDouble(); // input = recursive call
        }
        return input;
    }

    public double getDouble(double min, double max) {
        System.out.println("enter a number between " + min + " and " + max);
        double input;
        try{
            input = Double.valueOf(getString());
            if (input < min || input > max) throw new OutOfRangeException();
        }
        catch(NumberFormatException e) {
            System.out.println("Input is not valid.");
            input = getDouble(min, max);
        }
        catch(OutOfRangeException e) {
            System.out.println("Input is not within valid range.");
            input = getDouble(min, max);
        }
        System.out.println("You entered " + input);
        return input;
    }

//    public int getBinary() {
//        String input = scan.next();
//
//        return input;
//    }



    // Allow all of your methods for getting input to accept an optional
    // string parameter named "prompt". If passed, the method should
    // show the given prompt to the user before parsing the input.


    public static void main(String[] args) {

    }


}
