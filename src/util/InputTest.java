package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();


        System.out.println("Would you like to enter a double");
        if(input.yesNo()){
            double someDouble = input.getDouble();
            System.out.println("You entered " + someDouble);
        } else System.out.println("OK");


//         getString();
//         yesNo()
//         getInt(int min, int max)
//         getInt()
//         getDouble(double min, double max)
//         getDouble()
    }
}
