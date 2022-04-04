package U9_Inheritance.lab;

public class Strength extends Workout {
    private int weight;

    public Strength(String workoutName, int workoutNum, int duration, int weight) {
        super(workoutName, workoutNum, duration);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * prints out the strength workout in proper format.
     * when a strength workout is created and calls function the string is formatted uniformly when
     * laying out the workout week in fillArray
     * ex: Workout #1   Lifting    35
     * @return String
     */
    public String toString(){
        String output = " Workout #" + getWorkoutNum() + "\t\t" + getWorkoutName() + "\t\t" + getDuration();
        return output;
    }

    /**
     * calculates the amount of calories exerted lifting by multiplying a random integer
     * 1-3 (multiplier) by the weight in pounds being lifted
     * to help to calculate the total amount of calories
     * burnt in the WorkoutPlan
     *
     * @return
     */
    public int startExercise(){
        int rndMultiplier = (int)(Math.random() * 3) + 1;
        int calories =  rndMultiplier * weight;
        return calories;
    }
}
