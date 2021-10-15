package Unit4_Iteration.homework;

public class PigLatin {
    public static String toPigLatin(String sentence){
        String lowerCaseSentence = sentence.toLowerCase();

    }

    public static String translateWordToPigLatin(String word){


    }

    //return true or false if the word starts with a vowel
    public static boolean startsWithVowel(String word){
        if(word.substring(0,1).equals("a") || word.substring(0,1).equals("e") || word.substring(0,1).equals( "i" )|| word.substring(0,1).equals("o" )|| word.substring(0,1).equals("u") ){
            return true;
        }else{
            return false;
        }
    }
   //return true of false if the starts with Y
    public static boolean startsWithY(String word){
        if(word.substring(0,1).equals("y")){
            return true;
        }else{
            return false; 
        }
    }





}
