package shapes;

import javax.swing.*;

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

        System.out.println("Perimeter and Area of Box1");
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        System.out.println("Perimeter and Area of Box2");
        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        box2.getPerimeter();
    }
}
