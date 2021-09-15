package Unit2_UsingObjects.examples;

public class Student {

    //Instance variables
    private String name;
    private double gpa;
    private int grade;

    //constructor for name,grade,gpa
    public Student(String studName, int studGrade, double studGpa)
    {

        name = studName;
        grade = studGrade;
        gpa = studGpa;


    }

    public Student(String aName){
        name = aName;
        grade = 9;
        gpa = -1;

    }

}

//Student s1 = new Student("Mike", 11, 3.78);
//Student s2 = new Student("Varsha")