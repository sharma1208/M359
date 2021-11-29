package Unit6_Arrays;

public class StudentTester {
    public static void main(String[] args) {
        Course per1 = new Course("Accounting", "Str", "A+", 1);
        Course per2 = new Course("Spanish 3","Lernor","A", 2);
        Course per3 = new Course("APUSH", "FRieri", "A-", 3);
        Course per4 = new Course("Trig", "Piggot", "A", 4);
        Course per5 = new Course("Comp Sci", "Moon", "A+", 5);
        Course per6 = new Course("Gym", "Newby", "A+", 6);
        Course per7 = new Course("Chem", "Teberg", "A", 7);
        Course per8 = new Course ("Lunch", 8);

        Course[] schedule = {per1, per2, per3, per4, per5, per6, per7, per8};
        Student st1 = new Student("Venya", schedule);
        System.out.println(st1.toString());

        Student st2 = new Student("Joey");
        System.out.println(st2);






    }

}
