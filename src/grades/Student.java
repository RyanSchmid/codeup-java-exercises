package grades;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //METHODS

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the records grades
    public double getGradeAverage(){
        int sum = 0;
        for (int grade: this.grades) sum += grade;
        return (double) sum / this.grades.size();
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\n" +
                "Grades Average: " + this.getGradeAverage() + "\n";
    }

//    @Override
//    public String toString(){
//        return this.name.toString();
//    }

    public static void main(String[] args) {
        Student ryan = new Student("Ryan");
        Student sarah = new Student("Sarah");

        ryan.addGrade(0);
        ryan.addGrade(90);
        ryan.addGrade(60);

        System.out.println(ryan.grades);

        System.out.println(ryan.getGradeAverage());

    }
}
