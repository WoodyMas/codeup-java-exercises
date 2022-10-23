package shapes;

public class ShapesTest {
    public static void main(String[] args) {



        Quadrilateral rect = new Rectangle(5, 8);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        Quadrilateral square = new Square(7);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        System.out.println("My Shape");
        Measurable myShape = new Square(3);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        System.out.println("Your Shape");
        Measurable yourShape = new Rectangle(3, 5);
        System.out.println(yourShape.getArea());
        System.out.println(yourShape.getPerimeter());

        myShape = new Rectangle(3, 8);
        System.out.println(myShape.getPerimeter());

//        myShape.getLength();
//        myShape.getWidth();
        // You can't get width and length because they are Quadrilateral properties


//        InheritanceAndPolymorphismExerciseRectangle rec = new InheritanceAndPolymorphismExerciseRectangle();
//        System.out.println(rec.getArea());
//
//        InheritanceAndPolymorphismExerciseRectangle inheritanceAndPolymorphismExerciseRectangle = new InheritanceAndPolymorphismExerciseRectangle(5, 3);
//        System.out.println("Rectangle width 5, length 3");
//        System.out.println(inheritanceAndPolymorphismExerciseRectangle.getArea());
//        System.out.println(inheritanceAndPolymorphismExerciseRectangle.getPerimeter());

//        InheritanceAndPolymorphismExerciseSq newInheritanceAndPolymorphismExerciseSq = new InheritanceAndPolymorphismExerciseSq(8);
//        System.out.println("\nSquare Test");
//        System.out.println(newSquare.getLength());
//        System.out.println(newSquare.getWidth());

//        System.out.println(newInheritanceAndPolymorphismExerciseSq.getPerimeter());
//        System.out.println(newInheritanceAndPolymorphismExerciseSq.getArea());
//        System.out.println(newInheritanceAndPolymorphismExerciseSq.getWidth());

//        InheritanceAndPolymorphismExerciseRectangle newSqRec = new InheritanceAndPolymorphismExerciseSq(3);
//        newSqRec.setLength(4);
//        newSqRec.setWidth(4);

        // System.out.println(newSqRec.getPerimeter());
        // System.out.println(newSqRec.getArea());
        // System.out.println(newSqRec.getArea());


//        Rectangle rectangle = new Rectangle();
//        System.out.println("Testing building and setting rectangle parameters manually");
//        System.out.println("No length or width set. Perimeter is 0");
//        System.out.println(rectangle.getPerimeter());
//
//        rectangle.setWidth(5);
//        rectangle.setLength(2);
//        System.out.println("Area should be 10, Perimeter should be 14");
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter() + "\n");
//
//        System.out.println("Testing constructing a new Rectangle with length and width defined");
//
//        Rectangle rectangle1 = new Rectangle(4, 3);
//        System.out.println("Length set to 3, Width to 4. Area should be 12, Perimeter should be 14");
//        System.out.println(rectangle1.getArea());
//        System.out.println(rectangle1.getPerimeter() + "\n");
//
//        Square testSquare = new Square();
//        System.out.println("Testing building and setting square parameters manually");
//        System.out.println("No side set. Perimeter should be 0");
//        System.out.println(testSquare.getPerimeter() + "\n");
//
//        testSquare.setSide(5);
//        System.out.println(testSquare.getArea());
//        System.out.println(testSquare.getPerimeter());
    }
}
