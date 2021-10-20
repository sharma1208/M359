package Unit4_Iteration.homework;

public class PigLatin {
    public static String toPigLatin(String sentence){
        String lowerCaseSentence = sentence.toLowerCase();
        // String to store our translated sentence
        String toPig = "";
        //While loop to break a sentence into its separate words, translate each word,
        //and create a new sentence with the translated words until all words but the last are changed.
        while(lowerCaseSentence.indexOf(" ") != -1){
            int indexNum = lowerCaseSentence.indexOf(" ");
            String firstWord = lowerCaseSentence.substring(0, indexNum);
            toPig += translateWordToPigLatin(firstWord) + " ";
            lowerCaseSentence = lowerCaseSentence.substring(indexNum+1);
        }
        //translate the last word and add it to the translated sentence
        toPig += translateWordToPigLatin(lowerCaseSentence);

        return toPig.substring(0,1).toUpperCase() + toPig.substring(1);

    }



    public static String translateWordToPigLatin(String word){
        //if its a vowel, add yay to the end of the word
        if(startsWithVowel(word)){
            word += "yay";
            return word;
            //If something isn't a vowel, it has to start with a consonant or y, or it could have a cluster of consonants
        }else{
            //when the first and second letters are consonants (cluster),
            //take those letters and move they to the end, and add ay.
            if(startsWithVowel(word.substring(1,2)) == false){
                String firstTwoLetters = word.substring(0,2);
                String restWord = word.substring(2);
                word = restWord + firstTwoLetters + "ay";
                return word;

            }else{
                //when there is one consonant or a y that starts the sentence,
                //move the consonant to the back and add ay.
                String firstLetter = word.substring(0,1);
                String newWord = word.substring(1);
                word = newWord + firstLetter + "ay";
                return word;


            }

        }

    }

    //return true if the word starts with a vowel, else false
    public static boolean startsWithVowel(String word){
        if(word.substring(0,1).equals("a") || word.substring(0,1).equals("e") || word.substring(0,1).equals( "i" )|| word.substring(0,1).equals("o" )|| word.substring(0,1).equals("u") ){
            return true;
        }else{
            return false;
        }
    }






}
