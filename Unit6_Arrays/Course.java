package Unit6_Arrays;

public class Course {
    private String subject;
    private String teacherName;
    private String currentGrade;
    private int period;

    // Constructor for a course where all fields are passed in
    public Course(String subject, String teacherName, String currentGrade, int period) {
        this.subject = subject;
        this.teacherName = teacherName;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    // Constructor for a course without teacher/grade (lunch, study hall, early dismissal)
    public Course(String subject, int period) {
        this.subject = subject;
        this.period = period;
        this.teacherName = "None";
        this.currentGrade = "None";
    }

    // Create a toString method that returns course data on ONE line
    public String toString(){
        String output = "Period " + this.period + ": ";
        output += this.subject;
        output += " (" + this.teacherName + "), ";
        output += this.currentGrade;

        return output;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
