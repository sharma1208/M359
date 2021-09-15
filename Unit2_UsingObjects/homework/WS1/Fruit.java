package Unit2_UsingObjects.homework.WS1;

public class Fruit {

    private String name;
    private boolean ripe;
    private int servings;

    //constructor
    public Fruit(String fruitName, boolean isRipe){
        name = fruitName;
        ripe = isRipe;
        servings = 1; //default value = 1
    }

    public void printInfo(){
        //print name
        System.out.println("Name:" + " " + name);
        //print boolean
        System.out.println("Ripe:" + " " + ripe);
        //servings
        System.out.println("Number Servings:" + " " + servings);
        //add a println to create space
        System.out.println();
    }

    public int getServings(){
        return servings;
    }
}
