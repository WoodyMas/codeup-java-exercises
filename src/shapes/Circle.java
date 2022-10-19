package shapes;

import java.util.Scanner;
import util.Input;

public class Circle {

        Input input = new Input();
        Scanner scanner = new Scanner(System.in);

        private static double radius;
        static double PI = Math.PI;

    // circumference = 2 x pi x radius
    // area = pi x (radius ^ 2)

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
//        this.PI = PI;
    }

    public double setRadius(){
        System.out.println("Enter a radius");
        double userDouble = scanner.nextDouble();
        Circle.radius = userDouble;
        System.out.printf("You set the radius to %.2f %n", userDouble);
        getArea();
        getCircumference();
//        input.yesNo2();

        if (input.yesNo()){
            setRadius();
        } else {
            return userDouble;
        }

        return userDouble;
    }

    public double getArea (double radius){
        Circle.radius = radius;
        double area = Circle.PI * Math.pow(radius, 2);
        System.out.printf("The area of the circle is %.2f %n", area);
        return area;
    }

    public double getArea (){
        double area = Circle.PI * Math.pow(Circle.radius, 2);
        System.out.printf("The area of the circle is %.2f %n", area);
        return area;
    }

    public double getRadius() {

        return Circle.radius;
    }



    public double getCircumference(){
        double circumference = 2 * Circle.PI * Circle.radius;
        System.out.printf("The circumference of the circle is %.2f %n", circumference);
        return circumference;
    }



}
