package Unit4_Iteration.homework;

public class PigLatin {
    public static String toPigLatin(String sentence){
        String lowerCaseSentence = sentence.toLowerCase();
        String toPig = "";
        while(lowerCaseSentence.indexOf(" ") != -1){
            int indexNum = lowerCaseSentence.indexOf(" ");
            String firstWord = lowerCaseSentence.substring(0, indexNum);
            toPig += translateWordToPigLatin(firstWord);
            lowerCaseSentence = lowerCaseSentence.substring(indexNum+1);
        }
            //for the last word
        toPig += translateWordToPigLatin(lowerCaseSentence);
        return toPig.substring(0,1).toUpperCase() + toPig.substring(1);

    }



    public static String translateWordToPigLatin(String word){
        boolean firstChar = startsWithVowel(word);
        if(startsWithVowel(word)){
            word += "yay";
            return word;
        }else{
            //when consonant or starts with y
            if(startsWithVowel(word.substring(1,2)) == false){
                String firstTwoLetters = word.substring(0,2);
                String restWord = word.substring(1);
                word = restWord + firstTwoLetters + "ay";
                return word;

            }else{
                String firstLetter = word.substring(0,1);
                String newWord = word.substring(1);
                word = newWord + firstLetter + "ay";
                return word;


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
