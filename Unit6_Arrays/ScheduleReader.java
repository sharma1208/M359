package Unit6_Arrays;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScheduleReader {
    public static void main(String[] args)throws FileNotFoundException{
        File myFile = new File("scheduleData.txt");
        Scanner fileIn = new Scanner(myFile);

        //the first lines will say how many students
        int numStudentsInFile = fileIn.nextInt();
        fileIn.nextLine(); //dummyRead
        System.out.println(numStudentsInFile);

        Student[] myStudents = new Student[numStudentsInFile];

        int studentCount = 0;

        while(fileIn.hasNextLine()){
            String studentName = fileIn.nextLine();
            //array for storing ths students classes
            Course[] allClasses = new Course[8];
            for(int i = 0; i < 8; i++){
                //teacher,class,grade, period for this class
                String teacherName = fileIn.nextLine();
                String className = fileIn.nextLine();
                String grade = fileIn.nextLine();
                int period = fileIn.nextInt();
                if(fileIn.hasNextLine()) {
                    fileIn.nextLine();
                }
                Course c = new Course(className,teacherName, grade, period);
                allClasses[i] = c;

            }

            //Now that weve read in the courses, instantiate the student
            Student st = new Student(studentName, allClasses);
            myStudents[studentCount] = st;
            studentCount++;
        }
        //We are done reading in the file and want to show the whole class
        printAllStudentSchedules(myStudents);
    }

    public static void printAllStudentSchedules(Student[] allStudents){
        for (Student s: allStudents){
            if(s != null) {
                System.out.println(s);
                System.out.println();
            }
        }
    }
}
