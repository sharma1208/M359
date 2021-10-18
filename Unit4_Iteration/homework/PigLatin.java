package Unit4_Iteration.homework;

public class PigLatin {
    public static String toPigLatin(String sentence){
        String lowerCaseSentence = sentence.toLowerCase();

    }

    public static String translateWordToPigLatin(String word){
        boolean firstChar = startsWithVowel(word);
        if(startsWithVowel(word)){
            word += "yay";
            return word;
        }else{
            //when consonant or starts with y
            if(startsWithVowel(word.substring(1,2)) == true){
                

            }else{
                String firstLetter = word.substring(0,1);
                String newWord = word.substring(1);
                word = newWord + firstLetter + "ay";


            }

        }

    }

    //return true or false if the word starts with a vowel
    public static boolean startsWithVowel(String word){
        if(word.substring(0,1).equals("a") || word.substring(0,1).equals("e") || word.substring(0,1).equals( "i" )|| word.substring(0,1).equals("o" )|| word.substring(0,1).equals("u") ){
            return true;
        }else{
            return false;
        }
    }






}
