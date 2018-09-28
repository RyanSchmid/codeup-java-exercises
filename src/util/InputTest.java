package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println("Would you like to input an integer?");
//
//        if(input.yesNo()){
//            int someInt = input.getInt();
//            System.out.println("You entered " + someInt);
//        } else System.out.println("OK");


        System.out.println("Would you like to input a number?");
        if(input.yesNo()) input.getDouble(2, 16);

//         getString();
//         yesNo()
//         getInt(int min, int max)
//         getInt()
//         getDouble(double min, double max)
//         getDouble()
    }
}
