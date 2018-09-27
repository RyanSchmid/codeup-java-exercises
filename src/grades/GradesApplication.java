package grades;

import java.util.HashMap;

import util.Input;


public class GradesApplication {

    static HashMap<String, Student> records;

    static void init() {
        records = new HashMap<>();
        Student ryan = new Student("Ryan");
        ryan.addGrade(0);
        ryan.addGrade(90);
        ryan.addGrade(60);
//        System.out.println(ryan.getGradeAverage());

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

        records.put("coderman", ryan);
        records.put("PAlady", sarah);
        records.put("theVAN", pinot);
        records.put("theMerc", merc);
//            System.out.println(records);

    }

    static void runGrades() {

        System.out.println("\nWhat student would you like to see more information on?\n");
        Input userInput = new Input();
        String githubhandle = userInput.getString();
        if (records.containsKey(githubhandle)) {
            Student student = records.get(githubhandle);
            System.out.println(student);
        } else {
            System.out.println("Sorry, no student found with the github username of \"" + githubhandle + "\".");
        }
        System.out.println("Would you like to see another student? (y/n)\n");
        Input userInput2 = new Input();
        boolean keepGoing = userInput2.yesNo();
        if (keepGoing == true) {
            runGrades();
        } else {
            System.out.println("Goodbye, and have a wonderful day!");
        }
    }

    public static void main(String[] args) {
        init();
//        listGitNames(records);
        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our records:");
        for (String githubusername : records.keySet()) System.out.print(" |" + githubusername + "| ");


        runGrades();

        // Create at least 4 student objects with at least 3 grades each
        // and add them to the map.


    }
}
