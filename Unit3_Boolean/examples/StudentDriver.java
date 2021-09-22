package Unit3_Boolean.examples;

public class StudentDriver {
    public static void main(String[] args) {
        Student person = new Student("Venya", "Sharma", 123456);
        Student person2 = new Student("Lasya", "Nandyala", 123467);

        System.out.println(person.compareTo(person2));
        System.out.println(person.compareTo(person));
        System.out.println(person2.compareTo(person));
        System.out.println(person.equals(person2));
    }
}
