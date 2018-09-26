package grades;
import java.util.HashMap;
import java.util.ArrayList;
import util.Input;


public class GradesApplication {

    public static void listGitNames(HashMap inputHashMap) {
        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students:");

        System.out.println("What student would you like to see more information on?\n");
        Input userInput = new Input();
        if (inputHashMap.containsValue(userInput.getString())){
//            Student outputObject = inputHashMap.get(userInput);
            System.out.println("Name: ");
        }
        else{
            System.out.println("Sorry, no student found with github username of \"" + userInput + "\".");
        }


        System.out.println("Goodbye, and have a wonderful day!");
    }

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        // Create a class named GradesApplication with a main method.
        // Inside the main method, create a HashMap named students.

        // It should have keys that are strings that represent github
        // usernames, and values that are Student objects.

        Student ryan = new Student("Ryan");
        ryan.addGrade(0);
        ryan.addGrade(90);
        ryan.addGrade(60);
        System.out.println(ryan.getGradeAverage());

        Student sarah = new Student("Sarah");
        sarah.addGrade(80);
        sarah.addGrade(90);
        sarah.addGrade(100);
//        System.out.println(sarah.getGradeAverage());

        Student pinot = new Student("Pinot");
        pinot.addGrade(60);
        pinot.addGrade(72);
        pinot.addGrade(83);
//        System.out.println(pinot.getGradeAverage());

        Student merc = new Student("Mountaineer");
        merc.addGrade(90);
        merc.addGrade(92);
        merc.addGrade(95);
//        System.out.println(merc.getGradeAverage());

        students.put("coderman", ryan);
        students.put("PAlady", sarah);
        students.put("theVAN", pinot);
        students.put("theMerc", merc);

//        System.out.println(students);

        listGitNames(students);


        // Create at least 4 student objects with at least 3 grades each
        // and add them to the map.


    }
}
