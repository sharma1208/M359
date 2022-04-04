package U9_Inheritance.lab;

public class WorkoutPlan {
    private int workoutsCompleted;
    private int workoutsSkipped;
    private int currWeek;
    private int nextWorkoutNum;
    private int totalCalsBurned;
    private int totalMinsExercise;
    private Workout[][] workoutPlan;
    public static final String CARDIO_NAME = "Running";
    public static final String STRENGTH_NAME = "Lifting";
    public static final String WELLNESS_NAME = "Wellness";


    public WorkoutPlan(int numWeeks){
        workoutPlan = new Workout[numWeeks][7];
        currWeek = 0;
        nextWorkoutNum = 1;
        totalCalsBurned = 0;
        totalMinsExercise = 0;
        workoutsSkipped = 0;
        workoutsCompleted = 0;
        fillArray();
    }


    private void fillArray() {
        for (int row = 0; row < workoutPlan.length; row++) {
            currWeek++;
            System.out.println(toString());
            for (int col = 0; col < workoutPlan[0].length; col++) {
                int rndWorkout = (int) (Math.random() * 3) + 1;
                //passes in the workout number and decides which workout
                randomWorkout(rndWorkout,row, col);
                System.out.println(workoutPlan[row][col]);
            }
        }
    }

    private void randomWorkout(int num, int row, int col){
        if(num == 1){
           int randomMinutes = (int)(Math.random() * 31) + 10;
           int randomSpeed = (int)(Math.random() * 7) + 1;
           double calcDistance = randomMinutes/randomSpeed;
           Cardio running = new Cardio("Running", nextWorkoutNum, randomMinutes,calcDistance, randomSpeed);
           workoutPlan[row][col] = running;
           nextWorkoutNum++;

        }else if(num == 2){
            int randomMinutes = (int)(Math.random() * 46) + 15;
            int randomWeight = (int)(Math.random() * 131) + 95;
            Strength lifting = new Strength("Lifting", nextWorkoutNum, randomMinutes,randomWeight);
            workoutPlan[row][col] = lifting;
            nextWorkoutNum++;
        }else{
            int randomMinutes = (int)(Math.random() * 31) + 30;
            int randomStretches = (int)(Math.random() * 5) + 8;
            Wellness stretching = new Wellness("Stretching", nextWorkoutNum, randomMinutes,randomStretches);
            workoutPlan[row][col] = stretching;
            nextWorkoutNum++;
        }

    }

    public String toString(){
        String output = "****WEEK #" + currWeek + "****\n WORKOUT NUM\tNAME\t\tMINUTES";
        return output;
    }

    public void workoutNextWeek(){
        System.out.println("Skipped Workouts:");
        for(int col = 0; col < workoutPlan[0].length; col++){
            int chance = (int)(Math.random() * 10) + 1;
            if(chance == 1 || chance == 2){
                int workout = workoutPlan[currWeek][col].getWorkoutNum();
                System.out.println("You skipped workout #" + workout);
                workoutsSkipped++;
            }else{
                workoutsCompleted++;
                int cals = workoutPlan[currWeek][col].startExercise();
                totalCalsBurned += cals;
                totalMinsExercise += workoutPlan[currWeek][col].getDuration();
            }
        }
        currWeek++;
    }

    public void printProgress(){
        System.out.println("****CURRENT PROGRESS***");
        System.out.println("Workouts completed: " + workoutsCompleted);
        System.out.println("Workouts skipped:   " + workoutsSkipped);
        System.out.println("Total exercise(mins): "+ totalMinsExercise);
        System.out.println("Total cals burned: " + totalCalsBurned);
    }



    public int getWorkoutsCompleted() {
        return workoutsCompleted;
    }

    public void setWorkoutsCompleted(int workoutsCompleted) {
        this.workoutsCompleted = workoutsCompleted;
    }

    public int getWorkoutsSkipped() {
        return workoutsSkipped;
    }

    public void setWorkoutsSkipped(int workoutsSkipped) {
        this.workoutsSkipped = workoutsSkipped;
    }

    public int getCurrWeek() {
        return currWeek;
    }

    public void setCurrWeek(int currWeek) {
        this.currWeek = currWeek;
    }

    public int getNextWorkoutNum() {
        return nextWorkoutNum;
    }

    public void setNextWorkoutNum(int nextWorkoutNum) {
        this.nextWorkoutNum = nextWorkoutNum;
    }

    public int getTotalCalsBurned() {
        return totalCalsBurned;
    }

    public void setTotalCalsBurned(int totalCalsBurned) {
        this.totalCalsBurned = totalCalsBurned;
    }

    public int getTotalMinsExercise() {
        return totalMinsExercise;
    }

    public void setTotalMinsExercise(int totalMinsExercise) {
        this.totalMinsExercise = totalMinsExercise;
    }

    public Workout[][] getWorkoutPlan() {
        return workoutPlan;
    }

    public void setWorkoutPlan(Workout[][] workoutPlan) {
        this.workoutPlan = workoutPlan;
    }
}









