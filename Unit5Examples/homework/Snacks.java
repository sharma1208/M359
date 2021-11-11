package Unit5Examples.homework;

 public class Snacks{

    private String snackName;
    private NutritionalLabel facts;
    final public static int REC_CALORIES_PER_SNACK= 150;
    final public static int REC_SUGAR_PER_SNACK = 4;
    private static int totalSnackCals = 0;
     public static final String BLACK = "\033[40m";  // BLACK
     public static final String RESET = "\033[0m";     //RESET

    public Snacks(String name, NutritionalLabel labelFacts){
        snackName = BLACK + name + RESET;
        facts = new NutritionalLabel (labelFacts.getServingSize(), labelFacts.getCalories(), labelFacts.getSugarInGrams());
        totalSnackCals += labelFacts.getCalories();
    }

    public String getSnackName(){
        return snackName;
    }

    public void setSnackName(String snack){
        snackName = snack;
    }

    public NutritionalLabel getFacts(){
        return facts;
    }

    public void setFacts(NutritionalLabel newFacts){
        facts = newFacts;
    }

     /**
      * This method takes in both the getCaloriesPerServing and the getSugarPerServing
      * Then the method compares them and returns the RATING OF THE SNACK between 1-3
      * @return
      */
    public int getSnackHealthRating(){
        if(facts.getCaloriesPerServing() == REC_CALORIES_PER_SNACK && facts.getSugarPerServing()== REC_SUGAR_PER_SNACK){
            return 3;
        }else if (facts.getCaloriesPerServing()  < REC_CALORIES_PER_SNACK && facts.getSugarPerServing() < REC_SUGAR_PER_SNACK){
            return 2;
        }else if(facts.getCaloriesPerServing()  < REC_CALORIES_PER_SNACK || facts.getSugarPerServing() < REC_SUGAR_PER_SNACK){
            return 1;
        }else{
            return 0;
        }
    }

     public static int getTotalSnackCals() {
         return totalSnackCals;
     }
 }
