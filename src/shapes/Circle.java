package shapes;

public class Circle {

    private double radius;
    double pi = Math.PI;

    public static void main(String[] args) {
    // main
    }


    // This class should have a private radius property that is set through the constructor,
    // and various methods for getting information about the circle, detailed below.

    // constructor
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return (pi * radius * radius);
    }

    public double getCircumference(){
        return (2 * pi * this.radius);
    }


}

