package U9_Inheritance.lab;

public class Workout {
    private String workoutName;
    private int workoutNum;
    private int duration;

    public Workout(String workoutName, int workoutNum, int duration) {
        this.workoutName = workoutName;
        this.workoutNum = workoutNum;
        this.duration = duration;
    }

    public String toString(){
        String output = "Workout #" + workoutNum + "\t" + workoutName + "\t" + duration;
        return output;
    }

    public int startExercise(){
        System.out.println("Starting a workout");
        return 0;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public int getWorkoutNum() {
        return workoutNum;
    }

    public void setWorkoutNum(int workoutNum) {
        this.workoutNum = workoutNum;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
