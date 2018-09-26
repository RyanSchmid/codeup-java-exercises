package shapes;

public class Square extends Quadrilateral{

    public Square(double length) {
        super(length, length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        return 4*this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    // INHERITANCE EXERCISE
//    int side;
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//    // In the Square class, override the getArea and getPerimeter methods
//    // with the following definitions for a square
//    @Override
//    public int getPerimeter() {
//        return 4 * this.side;
//    }
//    @Override
//    public int getArea() {
//        return side * side;
//    }



}
