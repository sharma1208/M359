package Unit2_UsingObjects.examples;

import java.sql.SQLOutput;

public class Wrapperclassexample {
    public static void main(String[] args) {
        //similar to how you make a new car, or any object. Class version of an integer
        //wrapper classes for int and double
        Integer x = new Integer (17);
        Double y = new Double(5.8);

        //x is the box. but theres a value inside the box
        //find the x and y vals inside the box
       int xVal =  x.intValue();
       double yVal = y.doubleValue();

        System.out.println(xVal);
        System.out.println(yVal);

        //instead of doing all that to create a new box and put the value inside, use the shorthand autoboxing
        Integer perYear = 2021;
        //you dont have to manually box and unbox, its just there and extracted
        System.out.println(perYear);

        //create a double variable using autoboxing and have it print its value using autounboxing
        //identicaal to Double zVal = new Double(15.4);
        Double zVal = 15.4;
        //using auto unboxing
        //identical to sout(zVal.doubleValue())
        System.out.println(zVal);

        //print min and max integer values
        System.out.println("integer min:" + Integer.MIN_VALUE);
        System.out.println("integer max:" + Integer.MAX_VALUE);


    }

}
