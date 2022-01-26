package Unit7ArrayLists.examples;

public class Example {
    public static void main(String[] args) {
        scrambleWord("ANNA");
    }

    public static String scrambleWord(String word){
        String result = "";
        int currIndex = 0;
        while(currIndex < word.length()-1){
            String currLetter = word.substring(currIndex, currIndex+1);
            String nextLetter = word.substring(currIndex+1, currIndex+2);
            if(currLetter.equals("A") && !nextLetter.equals("A")){
                result += nextLetter;
                result += currLetter;
                currIndex += 2;
            }else{
                result += currLetter;
                currIndex++;
            }
        }
        result += word.substring(currIndex);
        return result;

    }
}
