import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] arg) {

//        int j = 5;
//        while (j <= 15) {
//            System.out.print(j + " ");
//            j++;
//        }
//        System.out.println();

//        int k = 0;
//        do{
//            k +=2;
//            System.out.println(k);
//        } while (k<100);

//        int k = 100;
//        do{
//            System.out.println(k);
//            k -= 5;
//        } while (k >= -10);

//        long x = 2;
//        do{
//            System.out.println(x);
//            x *= x;
//        } while (x <= 1000000);

        int k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while (k >= -10);

//        for (int j = 100; j >-11; j-=5) {
//            System.out.println(j);
//        }

        // FIZZBUZZ loop
        for (int y = 0; y <= 100; y++) {
            if (y % 3 == 0 & y % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (y % 3 == 0) {
                System.out.println("Fizz");
            } else if (y % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(y);
            }
        }

        // TABLE OF POWERS
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int inputNumber = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("number | square | cubed");
        System.out.println("------ | ------ | ------");
        for (int x = 1; x <= inputNumber; x++){
            int squared = x*x;
            int cubed = x*x*x;
            System.out.format("%-6s | %-6s | %-6s %n", x, squared, cubed);
        };


//        System.out.println("Please enter a numerical grade (0-100):");
//        int inputGrade = scanner.nextInt();
//        System.out.println("Do you wish to continue? [y/n].");
//        String confirm = scanner.next();
////          System.out.println(confirm);
//        if (confirm.toString() == "y") {
//            System.out.println("equal");
//            if (inputGrade >= 88 & inputGrade <= 100) {
//                System.out.println("Your grade is an A");
//            } else if (inputGrade >= 80 & inputGrade <= 87) {
//                System.out.println("Your grade is a B");
//            } else if (inputGrade >= 67 & inputGrade <= 79) {
//                System.out.println("Your grade is a C");
//            } else if (inputGrade >= 60 & inputGrade <= 66) {
//                System.out.println("Your grade is a D");
//            } else if (inputGrade >= 0 & inputGrade <= 59) {
//                System.out.println("Your grade is an A");
//            } else {
//                System.out.println("Not a valid grade");
//            }
//        } else {
//            System.out.println("We respect your privacy");
//        }


    }
}
