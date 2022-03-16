package U9_Inheritance.lab;

public class WorkoutPlan {
    private int workoutsCompleted;
    private int workoutsSkipped;
    private int currWeek;
    private int nextWorkoutNum;
    private int totalCalsBurned;
    private int totalMinsExercise;
    private Workout[][] workoutPlan;


    public WorkoutPlan(int workoutsCompleted, int workoutsSkipped, int currWeek, int nextWorkoutNum, int totalCalsBurned, int totalMinsExercise, Workout[][] workoutPlan) {
        this.workoutsCompleted = workoutsCompleted;
        this.workoutsSkipped = workoutsSkipped;
        this.currWeek = currWeek;
        this.nextWorkoutNum = nextWorkoutNum;
        this.totalCalsBurned = totalCalsBurned;
        this.totalMinsExercise = totalMinsExercise;
        this.workoutPlan = workoutPlan;
    }
}
