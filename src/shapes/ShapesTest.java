package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Width:");
        rectangle.getWidth();
        System.out.println("Length:");
        rectangle.getLength();


        Square square = new Square(2);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }
}
