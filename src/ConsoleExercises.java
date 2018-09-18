import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

//        String className = "Wrangell";
//        String dayOfWeek = "Tuesday";
//        String messageTemplate = "Hello %s! Happy %s!";
//        System.out.format(messageTemplate, className, dayOfWeek);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a name:");
//        String inputOne = scanner.nextLine();
//        System.out.println("Please enter a number:");
//        String inputTwo = scanner.next();
//        System.out.format("Hello %s %s", inputOne, inputTwo);



//        double pi = 3.14159;
//        String messageExample = "The value of pi is approximately %.2f.\n";
//        System.out.format(messageExample, pi);
//
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter an integer:");
//        int inputNumber = scanner.nextInt();
//        System.out.format("You entered %d%n", inputNumber);
//
//        System.out.println("Please enter three words:");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.nextLine();
////        System.out.println(wordOne + "\n" + wordTwo + "\n" + wordThree + "\n");
//        System.out.format("%s%n%s%n%s%n", wordOne, wordTwo, wordThree);
//
//        System.out.println("Please enter a sentence:");
//        String myPhrase = scanner.nextLine();
//        System.out.print(myPhrase);

        System.out.println("Lets calculate the perimeter and area of our classroom");
        System.out.println("Enter the length (ft):");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width (ft):");
        int width = Integer.parseInt(scanner.nextLine());
        int area = (length * width);
        int perimeter = (2*length) + (2*width);
        System.out.println("The area of the classroom is " + area);
        System.out.println("The perimeter of the classroom is " + perimeter);


    }
}
