package Unit2_UsingObjects.cars;
import java.util.Scanner;

public class CarTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Prompt user for car name
        System.out.println("Enter the car name: ");
        String carName = input.nextLine();

        //prompt user for model year
        System.out.println("enter the model year");
        int theYear = input.nextInt();

        //instantiate a 2018 car named honda accord
        Car honda = new Car(theYear,carName);
        honda.printInfo();
    }
}
