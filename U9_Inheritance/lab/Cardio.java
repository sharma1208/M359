package U9_Inheritance.lab;

public class Cardio extends Workout{
    private double distanceMiles;
    private double speedMPH;

    public Cardio(String workoutName, int workoutNum, int duration, double distanceMiles, double speedMPH) {
        super(workoutName, workoutNum, duration);
        this.distanceMiles = distanceMiles;
        this.speedMPH = speedMPH;
    }

    public double getDistanceMiles() {
        return distanceMiles;
    }

    public void setDistanceMiles(int distanceMiles) {
        this.distanceMiles = distanceMiles;
    }

    public double getSpeedMPH() {
        return speedMPH;
    }

    public void setSpeedMPH(double speedMPH) {
        this.speedMPH = speedMPH;
    }

    /**
     * prints out the cardio workout in proper format
     * when a cardio workout calls it the string ifs ormatted uniformly when
     * laying out the workout week in fillArray
     * ex: Workout #1     Running    35
     * @return String
     */
    public String toString(){
        String output =" Workout #" + getWorkoutNum() + "\t\t" + getWorkoutName() + "\t\t" + getDuration();
        return output;
    }

    /**
     * calculates the amount of calories exerted on a run by multiplying a random integer
     * between 80-140 by the number of miles run to help to calculate the total amount of calories
     * burnt in the WorkoutPlan
     * @return int
     */
    public int startExercise(){
        int calories = (int)(Math.random()*61)+80;
        calories *= (int) distanceMiles;
        return calories;

    }
}
