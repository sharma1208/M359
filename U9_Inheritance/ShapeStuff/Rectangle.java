package U9_Inheritance.ShapeStuff;

public class Rectangle extends Shape{
    private double width;
    private double length;
    private int numSides;

    public Rectangle(String name, String color, double width, double length) {
        super(name, color);
        this.width = width;
        this.length = length;
        numSides = 4;
    }

    @Override
    public String toString(){
        String output = "You have a " + super.getColor() + " rectangle called " + super.getName() + "with a width of "
                + width + " and a length of " + length;
        return output;
    }

    public void scaleSize(double scaleFactor){
        width *= scaleFactor;
        length *= scaleFactor;

    }


    public double findArea(){
        return width*length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}


