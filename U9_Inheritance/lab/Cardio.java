package U9_Inheritance.lab;

public class Cardio extends Workout{
    private int distanceMiles;
    private double speedMPH;

    public Cardio(String workoutName, int workoutNum, int duration, int distanceMiles, double speedMPH) {
        super(workoutName, workoutNum, duration);
        this.distanceMiles = distanceMiles;
        this.speedMPH = speedMPH;
    }

    public int getDistanceMiles() {
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

    public String toString(){
        String output =" Workout #" + getWorkoutNum() + "\t" + getWorkoutName() + "\t" + getDuration();
        return output;
    }

    //method for startExcercise needed
    public int startExercise(){
        int calories = (int)(Math.random()* 61)+80;
        calories *= distanceMiles;
        return calories;

    }
}
