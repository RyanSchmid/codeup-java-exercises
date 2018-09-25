package shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public double getPerimeter(){
        return 2*(this.length + this.width);
    }

    public double getArea(){
        return (this.length * this.width);
    }

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
