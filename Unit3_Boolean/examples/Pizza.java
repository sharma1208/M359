package Unit3_Boolean.examples;

public class Pizza {

    private String store;
    private int inches;
    private int numToppings;
    boolean isDeepDish;

    //constructor
    public Pizza(String store, int inches, int numToppings, boolean isDeepDish) {
        this.store = store; // this objects variable is gonna be the store that was just passed
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }


    public Pizza(String store, int inches, boolean isDeepDish) {
        this.store = store;
        this.inches = inches;
        this.isDeepDish = isDeepDish;
    }


    //getters and setters

    public String getStore() {
        return store;
    }
    public void setStore(String store) {
        this.store = store;
    }

    public int getInches() {
        return inches;
    }
    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }
    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }
    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }




    //printInfo method, print all of the pizza's information
    public void printInfo(){
        System.out.println("Store: " +  store);
        System.out.println("Pizza inches: " + inches);
        System.out.println("Number of Toppings: " + numToppings);
        System.out.println("Deep Dish Pizza: " + isDeepDish);
    }

    //toString method: returns the pizza in a string or text form
    public String toString(){
        String output = "Store: " +  store;
        output += "Pizza inches: " + inches;
        output += "Number of Toppings: STUPID CHANGE" + numToppings;
        output += "Deep Dish Pizza: " + isDeepDish;
        return output;
    }

    // .equals method: return true if both pizzas are equivalent, false otherwise
    //if two pizzas are from the same store, then they are equal (for now)

    public boolean equals(Pizza other){
        return(this.inches == other.inches);
    }


    public int compareTo(Pizza other){
        //return + if pizza is bigger, return - if pizza is smaller, 0 is equal
        //long version
        if(this.inches > other.inches){
            return 1;
        }else if(this.inches == other.inches){
            return 0;
        }else {
            return -1;
        }
    }

    // other version: return(this.inches - other.inches);
}

