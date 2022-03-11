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

    public String toString(){
        String output = "Workout #" + getWorkoutNum() + "\t" + getWorkoutNum() + "\t" + getDuration();
        return output;
    }

    //startExercise

}
