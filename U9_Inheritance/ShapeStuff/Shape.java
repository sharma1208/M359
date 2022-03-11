package U9_Inheritance.ShapeStuff;

public class Shape {
    private String color;
    private String name;

    public Shape(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public String toString(){
        String output = color + " " + name;
        return output;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
