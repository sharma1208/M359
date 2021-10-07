package Unit4_Iteration.examples;

public class Notes43StringAlgos {
        public static void main(String[] args) {

            // PART I
            String mySchool = "Fremd Vikings";

            // print every other character of mySchool on the same line
            for(int i =0; i < mySchool.length(); i += 2){
                System.out.print(mySchool.substring(i, i + 1) + " ");
            }

            System.out.println();
            // print the String mySchool in reverse (all characters on the same line)
            for(int i = mySchool.length()-1; i >= 0; i--){
                System.out.print(mySchool.substring(i,i+1));
            }




         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
            System.out.println();
            String animalName = "penguin";
            String firstLetter = " ";
            for(int i = 0; i < animalName.length(); i++){
               firstLetter += animalName.substring(i,i+1);
                System.out.println(firstLetter);
            }


            // PART III
            String phrase = "Mary had a little lamb, little lamb, little lamb";
            phrase += "Mary had a little lamb, its fleece was white as snow";

            // Print the amount of times the word "little" appears within phrase?
            boolean isDone = false;
            int count = 0;
            while(isDone == false){
               int loc = phrase.indexOf("little");
               if(loc == -1){
                   isDone = true;
               }else{
                   count++;
                   phrase = phrase.substring(loc+6);
               }

            }
                System.out.println(count);


            // create a new String, or modify the existing String, that removes
            // the word "little" entirely
            phrase = "Mary had a little lamb, little lamb, little lamb ";
            phrase += "Mary had a little lamb, its fleece was white as snow";
            boolean finished = false;
            while(finished == false){
                int location =  phrase.indexOf("little");
                if(location != -1){
                    phrase = phrase.substring(0,location) + phrase.substring(location + 6);
                }else{
                    finished = true;
                }

            }
            System.out.println(phrase);




            // create a new String (based on phrase), or modify the existing String,
            // that replaces the word "little" with the word "BIG"




        }
    }

