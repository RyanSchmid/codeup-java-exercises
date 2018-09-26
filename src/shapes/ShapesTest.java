package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5, 4.0001);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(4.0001);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        ((Square) myShape).getLength();

        //when we call getLength() on myShape, it has to cast it to a type that
        // is included in it's interface


        // PRIOR EXERCISE
//        //  create a variable of the type Rectangle named box1
//        //  assign it a new instance of the Rectangle class with a width of 4 and a length of 5
//
//        Rectangle box1 = new Rectangle(5, 4);
//
//        //  verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//
//        //  create a variable of the type Rectangle named box2
//        //  and assign it a new instance of the Square class that has a side value of 5.
//        Rectangle box2= new Square(5);
//        //  verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}
