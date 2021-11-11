package Unit5Examples.homework;

public class NutritionalLabel{
    //instance variables
    private double servingSize;
    private double calories;
    private double sugarInGrams;
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String RED = "\033[0;31m";     // RED
    public static final String RESET = "\033[0m";     //RESET

    //calories per serving + sugar per serving
    private double caloriesPerServing;
    private double sugarPerServing;

    //the main constructor
    public NutritionalLabel(double servingSize, double calories, double sugarInGrams){
        this.servingSize = servingSize;
        this.calories = calories;
        this.sugarInGrams = sugarInGrams;
        caloriesPerServing = calories/servingSize;
        sugarPerServing = sugarInGrams/servingSize;
    }

    /**
     *returns the layout for the information stored
     *within the 3 instance variables
     *int servingSize, int calories, int sugarInGrams
*/
    public String toString(){
        return BLUE + "Calories: " + calories  + RESET + "\n"+ PURPLE + "Serving Size: " + servingSize + " cups" + RESET + "\n" + RED + "Sugar In Grams: " + sugarInGrams + " g" + RESET;
    }

    //getters and setters for all of the instance variables
    //getter and setter for servingSize
    public void setServingSize(int servingSize){
        this.servingSize = servingSize;
    }
    public double getServingSize(){
        return servingSize;
    }

    //getter and setter for calories
    public void setCalories(int calories){
        this.calories = calories;
    }
    public double getCalories(){
        return calories;
    }

    //getter and setter for sugarInGrams
    public void setSugarInGrams(int sugarInGrams){
        this.sugarInGrams = sugarInGrams;
    }
    public double getSugarInGrams(){
        return sugarInGrams;
    }

    //getter and setter for sugarInGrams
    public void setCaloriesPerServing(double caloriesPerServing){
        this.caloriesPerServing = caloriesPerServing;
    }
    public double getCaloriesPerServing(){
        return caloriesPerServing;
    }

    //getter and setter for sugarInGrams
    public void setSugarPerServing(double sugarPerServing){
        this.sugarPerServing = sugarPerServing;
    }
    public double getSugarPerServing(){
        return sugarPerServing;
    }

}
