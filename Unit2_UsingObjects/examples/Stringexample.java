package Unit2_UsingObjects.examples;

public class Stringexample {
    public static void main(String[] args) {
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";
//.toUpperCase makes sring capitalize
        System.out.println(s1.toUpperCase());
        //s1 is still the lowercase version, but we temporarily got the upper case version with toUpperCase earlier. now it prints normally
        System.out.println(s1);
//finds the first occurence of the letter u and x in s2 and then returns the index, with the first letter at index+ 0 and counting upwards
        System.out.println(s2.indexOf("u"));
        System.out.println(s2.indexOf("x"));
//returns part of the string starting at index 4 until the end
        System.out.println(s1.substring(4));
        //prints substring starting at 2 and ending before 5. so it return index 2-5, or whatever the last number is -1
        System.out.println(s1.substring(2, 5));

        //the length in normal counting of the word for s1 and s2
        System.out.println(s1.length());
        System.out.println(s2.length());
//if s1 equals exactly whats printed in the string, then it will return a true boolean, otherwise false
        boolean isEqual = s1.equals("VACATION");
        System.out.println(isEqual);
//if s1 equals exactly what is written, it is true. otherwise false

        isEqual = s1.equals("Vacation");
        System.out.println(isEqual);
        //change original s1 string to upper case and then check if it is equal to the string in paranthases exactly as it is
        isEqual = s1.toUpperCase().equals("VACATION");
        System.out.println(isEqual);
//make new strings
        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";

        //compare s3 string to s4 string, and comparing the distance between how aplhabetically the words are and  they are to figure out if a string is more or less than the other
       //is it negative or positive or 0
        //bad to bird gives us a negative numbers because bat comes before bird alphabetically
        System.out.println(s3.compareTo(s4));
        //s3 and s3 are equal to each other, so they return 0
        System.out.println(s3.compareTo(s3));
        //bird is greater than bat because it comes after it alphabetically
        System.out.println(s4.compareTo(s3));
        //capital Mickey comes before bat because capitalization comes before in ascii
        System.out.println(s5.compareTo(s3));

        System.out.println("I love " + "M" + "3" + "5" + "9");
        System.out.println("I love " + "M" + (3 + 5 + 9));

        System.out.println(24 + 56 + " Days of School");
        System.out.println("Days of School: " + 24 + 56);
    }
}
