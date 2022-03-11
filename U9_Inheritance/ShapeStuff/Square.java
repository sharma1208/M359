package U9_Inheritance.ShapeStuff;

public class Square extends Rectangle{

    //mo private instance variables becuse it is a rectangle but just a side length instead of a width and a length

    public Square(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);
    }

    @Override
    public String toString(){
        String output = "You have a " + super.getColor() + " square called " + super.getName() + "with a length of " +  super.getWidth();
        return output;
    }


}
