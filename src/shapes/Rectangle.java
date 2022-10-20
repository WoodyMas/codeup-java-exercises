package shapes;

public class Rectangle {
    private int length;
    private int width;

    Rectangle(){

    }

    Rectangle(int width, int length){
        this.setLength(length);
        this.setWidth(width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea (){
        return getLength() * getWidth();
    }
    public int getPerimeter(){
        return (2 * getLength() + (2 * getWidth()));
    }
}
