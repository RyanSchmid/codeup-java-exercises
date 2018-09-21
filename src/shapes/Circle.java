package shapes;

public class Circle {

    private double radius;

    public static void main(String[] args) {
    // main
    }


    // This class should have a private radius property that is set through the constructor,
    // and various methods for getting information about the circle, detailed below.

    // constructor
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return (Math.PI * radius * radius)
    }

    public double getCircumference(){
        return (2 * Math.PI * this.radius)
    }


}

