package Unit4_Iteration.examples;

public class Notes44CodeAnalysis {
    public static void main(String[] args) {
        for(int i = 5; i > 0;  i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // Challenge 2
        for(int i = 5; i > 0;  i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //Challenge 3




    public static void everyOtherLetterPyramid(String letters) {
        String current = letters;
        System.out.println(current);
        while (current.length() > 1) {
            String updated = "";
            for (int i = 0; i < current.length(); i += 2) {
                updated += letters.substring(i, i + 1);
            }
            current = updated;
            System.out.println(current);
        }
    }}


