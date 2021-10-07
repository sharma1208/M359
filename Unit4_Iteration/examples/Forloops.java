package Unit4_Iteration.examples;

public class Forloops {
    public static void main(String[] args) {
        //even numbers from 0-20 on same line
        for(int i = 0; i <= 20; i+=2){
            System.out.print(i + " ");
        }

        System.out.println();
        //multiples of 5 from 5 to 100 on the same line
        for(int i = 5; i <= 100; i += 5){
            System.out.print(i + " ");
        }
        System.out.println();
        //print every character of String str with space in between them
        String str = "cookie";
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println();
        //print every character of String str in reverse order
        for(int i = str.length()-1; i >= 0 ; i--){
            System.out.print(str.charAt(i) + " ");
        }

    }
}
