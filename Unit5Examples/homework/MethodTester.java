package Unit5Examples.homework;

 public class MethodTester {
     public static void main(String[] args) {


//meal
         NutritionalLabel burgerFacts = new NutritionalLabel(2, 2000, 3);
         Meals hamburger = new Meals("Hamburger", burgerFacts);


//snack
         NutritionalLabel goldfishFacts = new NutritionalLabel(1, 300, 4);
         Snacks goldfish = new Snacks("Goldfish", goldfishFacts);

         whichIsHealthier(hamburger, goldfish);
         greaterSugar(hamburger, goldfish);
         compareCalories(hamburger, goldfish);
     }


     /**
      * This method returns the name of the food that is *healthier between a meal and a snack
      * 1. If the calories and serving sizes are the same, *check the amount of sugar, whichever is less should be *returned.
      * 2. If they are not the same serving size, fix them *accordingly and return the one with the lower calories,
      * if they are still the same, return the one with less
      * sugar.
      *
      * @param meal
      * @param snack
      */

     public static void whichIsHealthier(Meals meal, Snacks snack) {
         if (meal.getMealHealthRating() > snack.getSnackHealthRating()) {
             System.out.println("The meal " + meal.getMealName() + " is healthier than " + snack.getSnackName().toLowerCase());
         } else if (meal.getMealHealthRating() < snack.getSnackHealthRating()) {
             System.out.println("The snack " + snack.getSnackName() + " is healthier than " + meal.getMealName());
         } else {
             System.out.println("They are both equally healthy.");
         }
     }

     public static void greaterSugar(Meals meal, Snacks snack){
         if(meal.getFacts().getSugarInGrams() > snack.getFacts().getSugarInGrams()){
             System.out.println("The meal " + meal.getMealName() + " has more sugar than the snack.");
         }else if(meal.getFacts().getSugarInGrams() < snack.getFacts().getSugarInGrams()){
             System.out.println("The snack " + snack.getSnackName() + " has more sugar than the meal.");
         }else{
             System.out.println("They are equal in sugar");
         }
     }

     public static void compareCalories(Meals meal, Snacks snack){
         int recCalsADay = 2000;
         int caloriesTotal = meal.getTotalMealCals() + snack.getTotalSnackCals();
         int caloriesToEat = recCalsADay - caloriesTotal;
         int caloriesYouAte = Math.abs(caloriesTotal - recCalsADay);
         if(caloriesTotal == recCalsADay){
             System.out.println("You are eating a sufficient amount of calories per day!");
         }else if(recCalsADay > caloriesTotal){
             System.out.println("You need to eat " + caloriesToEat + " more calories.");
         }else{
             System.out.println("You ate " + caloriesYouAte + " more calories than recommended");
         }
     }
 }



