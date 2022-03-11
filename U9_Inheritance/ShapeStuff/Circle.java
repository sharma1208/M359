package U9_Inheritance.ShapeStuff;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        String output = super.getColor() + " " +  super.getName() + " with radius " + " radius";
        return output;
    }

    public double findArea(){
        return (Math.PI * radius * radius);
    }




}
