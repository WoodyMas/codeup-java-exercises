package shapes;

public class InheritanceAndPolymorphismExerciseSq extends InheritanceAndPolymorphismExerciseRectangle {
    private int side;




    public InheritanceAndPolymorphismExerciseSq(){

    }

    public InheritanceAndPolymorphismExerciseSq(int estSide){
        this.setSide(estSide);
    }

    public int getSide(){
        return this.side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public int getWidth (){
        return super.getWidth();
    }




//    public Square(int side){
//        super.setLength(side);
//        super.setWidth(side);
//    }

    public int getPerimeter(){
        System.out.println("Square perimeter method");
        return 4 * getSide();
    }

    public int getArea (){
        System.out.println("Square area method");
        return (int) Math.pow(getSide(), 2);
    }

















//    Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//
//    public Square(){
//
//    }
//
//    public Square(int side){
//        this.setSide(side);
//
//    }
//
//    public void setSide(int side) {
//        super.setLength(side);
//        super.setWidth(side);
//    }
//
//    public int getArea(){
//        int area = (int) Math.pow(side, 2);
//        return area;
//    }
//    public int getPerimeter(){
//        int perimeter = (int) side * 4;
////        System.out.printf("New method for Square: ", perimeter);
//        return perimeter;
//    }


}
