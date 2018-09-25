package shapes;

public class Square extends Rectangle {
    int side;

    public Square(int side) {
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
        }

    // In the Square class, override the getArea and getPerimeter methods
    // with the following definitions for a square

    // perimeter = 4 x side
    // area = side ^ 2
    }