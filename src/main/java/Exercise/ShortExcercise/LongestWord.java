package Exercise.ShortExcercise;

import java.util.List;

public class LongestWord {
    public static String findMaximumLengthWord(List<String> wordsList){
        String longestWord=wordsList.get(0);
        for(int i=1;i<wordsList.size();i++){
            if (longestWord.length()<wordsList.get(i).length()){
                longestWord= wordsList.get(i);
            }
        }
        return longestWord;
    }

}
