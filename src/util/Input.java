package util;

import java.util.Scanner;

public class Input {

    Scanner scanner;

    //constructor to build scanner for each input;
    public Input() {
        this.scanner = new Scanner(System.in).useDelimiter("\n");
    }

    ;

    public String getString() {

    }

    public boolean yesNo() {

//        if (input.equals("y")
//                || input.equals("Y")
//                || input.equals("yes")
//                || input.equals("YES")
//                || input.equals("Yes")
//        ) return true;
//        else return false;
    }

    public int getInt() {
        //
    }

    public int getInt(int min, int max) {

        // The getInt(int min, int max) method should keep prompting
        // the user for input until they give an integer within
        // the min and max.
    }

    double getDouble() {
        // The getDouble method should do the same thing,
        // but with decimal numbers.
    }

    public double getDouble(double min, double max) {

    }


    // Allow all of your methods for getting input to accept an optional
    // string parameter named "prompt". If passed, the method should
    // show the given prompt to the user before parsing the input.


    public static void main(String[] args) {

    }


}
