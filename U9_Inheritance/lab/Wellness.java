package U9_Inheritance.lab;

public class Wellness extends Workout{
    private int numStretches;

    public Wellness(String workoutName, int workoutNum, int duration, int numStretches) {
        super(workoutName, workoutNum, duration);
        this.numStretches = numStretches;
    }

    public int getNumStretches() {
        return numStretches;
    }

    public void setNumStretches(int numStretches) {
        this.numStretches = numStretches;
    }

    public int startExercise(){
       int rndCalsPer = (int)(Math.random() * 6) + 5;
       int totalCals = rndCalsPer * numStretches;
       return totalCals;

    }

    /**
     * prints out the wellness workout in proper format.
     * when a wellness workout is called the string is formatted uniformly when
     * laying out the workout week in fillArray
     * ex: Workout #1   Lifting    35
     * @return
     */
    public String toString(){
        String output = " Workout #" + getWorkoutNum() + "\t\t" + getWorkoutName() + "\t" + getDuration();
        return output;
    }
}
