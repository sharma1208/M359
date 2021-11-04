package Unit5Examples.homework;

 public class MethodTester {
    public static void main(String[] args) {


//meal
        NutritionalLabel burgerFacts = new NutritionalLabel(2, 540, 5);
        Meals hamburger = new Meals("Hamburger", burgerFacts);


//snack
        NutritionalLabel goldfishFacts = new NutritionalLabel(1, 120, 0);
        Snacks goldfish = new Snacks("Goldfish", goldfishFacts);

        whichIsHealthier(hamburger,goldfish);
    }


/**
 * This method returns the name of the food that is *healthier between a meal and a snack
 * 1. If the calories and serving sizes are the same, *check the amount of sugar, whichever is less should be *returned.
 *2. If they are not the same serving size, fix them *accordingly and return the one with the lower calories,
 * if they are still the same, return the one with less
 *sugar.
 * @param meal
 * @param snack
 */

        public static void whichIsHealthier (Meals meal, Snacks snack){
            if (meal.getMealHealthRating() > snack.getSnackHealthRating()){
                System.out.println("The meal " + meal.getName() + "is healthier than " + snack.getSnackName());
            }else if(meal.getMealHealthRating() < snack.getSnackHealthRating()){
                System.out.println("The snack " + snack.getSnackName() + "is healthier than " + meal.getName());
            }else{
                System.out.println("They are both equally healthy.");
            }
        }

    }

