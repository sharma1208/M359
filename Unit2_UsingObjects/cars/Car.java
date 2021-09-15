package Unit2_UsingObjects.cars;

public class Car {
    //instance variables
    private int modelYear;
    private String name;

    //getters and setters
    public int getModelYear(){
        return modelYear;
    }
    public void setModelYear(int my){
        modelYear = my;
    }

    //getter and setter for name
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    //Constructor
    public Car(String modelName){
        name = modelName;
        modelYear = 2021;
    }

    public Car(int aYear, String modelName){
        name = modelName;
        modelYear = aYear;
    }

    public void printInfo(){
        System.out.println("car year:" + " " + modelYear);
        System.out.println("car name:" + " " + name);
        System.out.println();
    }

}
