package shapes;

public class Rectangle {

    protected int length;
    protected int width;


    public void Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea(){
        return length*width;
    }

    public int getPerimeter(){
        return 2*(length + width);
    }

}
