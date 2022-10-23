package shapes;

public class InheritanceAndPolymorphismExerciseRectangle {




    // ================== OLD =============
    protected int length;
    protected int width;

    InheritanceAndPolymorphismExerciseRectangle(){

    }

    public InheritanceAndPolymorphismExerciseRectangle(int width, int length){
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
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea (){
//        return getLength() * getWidth();
        return this.getLength() * this.getWidth();
    }
    public int getPerimeter(){
        return (2 * this.getLength() + (2 * this.getWidth()));
    }
}
