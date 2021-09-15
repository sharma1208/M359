package Unit2_UsingObjects.PracticeQuiz;

public class Toy
{
    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the toy name and price
    private String toyName;
    private double toyPrice;


    // *** WRITE CODE HERE ***
    // Part B
    // Create getters & setters for all instance variables
    public String getToyName(){
        return toyName;
    }

    public void setToyName(String name){
        toyName = name;
    }

    public double getToyPrice(){
        return toyPrice;
    }
    public void setToyPrice(double price){
        toyPrice = price;
    }
    // *** WRITE CODE HERE ***
    // Part C
    // Create a full constructor that accepts each instance
    // variable as a parameter
    public Toy(String name,double price){
        toyName = name;
        toyPrice = price;
    }

    // *** WRITE CODE HERE ***
    // Part D
    // Create a calcTotal method that adds a 10% tax to the
    // price and returns the total cost

    public double calcTotal(){
        double totalPrice = toyPrice * 1.1;
        return totalPrice;
    }




}
