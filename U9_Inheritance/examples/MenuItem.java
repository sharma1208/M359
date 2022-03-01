package U9_Inheritance.examples;

public class MenuItem {
    private String name;

    public MenuItem() {
        name = "none given";
        System.out.println("Created a MenuItem without a name?!?!?");
    }
    public MenuItem(String name) {
        this.name = name;
        System.out.println("Created a MenuItem called " + name);
    }

    //write a method with the same exact name in a lower class to change whatever president was in the parent class
    @Override
    public String toString(){
        String output = "Menu item: " + name;
        return output;
    }

    public String getName() {
        return name;
    }
}
