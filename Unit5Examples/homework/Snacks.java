package Unit5Examples.homework;

 public class Snacks{

    private String snackName;
    private NutritionalLabel facts;
    final public static int REC_CALORIES_PER_SNACK= 300;
    final public static int REC_SUGAR_PER_SNACK = 4;

    public Snacks(String name, NutritionalLabel labelFacts){
        snackName = name;
        facts = new NutritionalLabel (labelFacts.getServingSize(), labelFacts.getCalories(), labelFacts.getSugarInGrams());
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














}
