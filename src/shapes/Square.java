package shapes;

public class Square extends Quadrilateral {
    int side = this.length;

    public Square(int side) {
        super(side, side);
    }

    public double getPerimeter(){
        return 4*(this.side);
    }

    public double getArea(){
        return (this.side * this.side);
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
