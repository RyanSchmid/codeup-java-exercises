package shapes;

public class Rectangle extends Quadrilateral{

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.length + this.width);
    }

    @Override
    public double getArea() {
        return (this.length*this.width);
    }

    // implementing Measurable requires implementing all of the methods
    // included/ declared within the Measurable interface

    //    INHERITANCE EXERCISE //
//    protected int length;
//    protected int width;
//
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getArea(){
//        return length*width;
//    }
//
//    public int getPerimeter(){
//        return 2*(length + width);
//    }














}
