package shapes;

public class Square extends Rectangle{
//    private int side;

//    Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.

    public Square(){

    }

    public Square(int side){
        this.setSide(side);

    }

    public void setSide(int side) {
        super.setLength(side);
        super.setWidth(side);
    }


}
