package shapes;
import util.Input;

public class CircleApp {


    public static void main(String[] args) {

    Input input = new Input();
    System.out.println("Please input the radius of a new circle");
    double radius = input.getDouble();

    Circle circle = new Circle(radius);
    System.out.println("Circle area is: " + circle.getArea());
        System.out.print("Circle circumference is: " + circle.getCircumference());
    }


}
