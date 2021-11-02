package Unit5Examples.homework;

public class Snacks{

    private String snackName;
    private NutritionalLabel facts;
    final public static int REC_CALORIES_PER_SNACK= 300;
    final public static int REC_SUGAR_PER_SNACK = 4;

    public Snacks(String name, NutritionalLabel facts){
        name = snackName;
        facts = new NutrionalLabel(facts.getServingSize(), facts.getCalories(), facts.getsugarInGrams());
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
        if(caloriesPerServing == REC_CALORIES_PER_SNACK && sugarPerServing == REC_SUGAR_PER_MEAL){
            return 3;
        }else if (caloriesPerServing < REC_CALORIES_PER_SNACK && sugarPerServing < REC_SUGAR_PER_SNACK){
            return 2;
        }else if(caloriesPerServing < REC_CALORIES_PER_SNACK || sugarPerServing < REC_SUGAR_PER_MEAL){
            return 1;
        }else{
            return 0;
        }
    }














}