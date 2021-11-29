package Unit6_Arrays;

public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name){
        this.name = name;
        this.myClasses = new Course[8]; // 8-period day with empty classes
    }

    public Student(String name, Course[] myClasses){
        this.name = name;
        this.myClasses = myClasses;     // Accepts a fully set-up schedule
    }

    // Create a toString method putting together:
    //  1. student's name
    //  2. all of the students classes (1 per line)
    // and return that string
    public String toString(){
        String output = name + "\n";
        if(myClasses[0] == null){
            output += "Does not yet have any classes yet";
        }else {

            for (int i = 0; i < myClasses.length; i++) {
                output += myClasses[i].toString() + "\n";
            }
        }
        return output;
    }



}


