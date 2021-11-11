package Unit5Examples.homework;

public class Meals{
    //Private instance variables
    private String mealName;
    private NutritionalLabel facts;
    final public static int REC_CALORIES_PER_MEAL= 600;
    final public static int REC_SUGAR_PER_MEAL = 8;
    private static int totalMealCals = 0;
    public static final String BLACK = "\033[40m";  // BLACK
    public static final String RESET = "\033[0m";     //RESET

    public Meals(String name, NutritionalLabel labelFacts){
        this.mealName = BLACK + name + RESET;
        this.facts = new NutritionalLabel(labelFacts.getServingSize(), labelFacts.getCalories(), labelFacts.getSugarInGrams());
        totalMealCals += labelFacts.getCalories();
    }

    // Getters & setters for the name of the meal
    public String getMealName() {
        return mealName;
    }

    public void setMealName(String newName) {
        mealName = newName;
    }

    // Getters & setters for nutritional facts (calories, serving size, sugar)
    public NutritionalLabel getFacts(){
        return facts;
    }

    public void setFacts(NutritionalLabel newFacts){
        facts = newFacts;
    }
    //health rating ranges from 0-3

    /**
     * This method takes in both the getCaloriesPerServing and the getSugarPerServing
     * Then the method compares them and returns the RATING OF THE MEAL between 1-3
     * @return
     */
    public int getMealHealthRating(){
        if(facts.getCaloriesPerServing() == REC_CALORIES_PER_MEAL && facts.getSugarPerServing()== REC_SUGAR_PER_MEAL){
            return 3;
        }else if (facts.getCaloriesPerServing()< REC_CALORIES_PER_MEAL && facts.getSugarPerServing() < REC_SUGAR_PER_MEAL){
            return 2;
        }else if(facts.getCaloriesPerServing() < REC_CALORIES_PER_MEAL || facts.getSugarPerServing() < REC_SUGAR_PER_MEAL){
            return 1;
        }else{
            return 0;
        }
    }

    public static int getTotalMealCals() {
        return totalMealCals;
    }
}


