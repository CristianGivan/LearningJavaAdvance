package Exercise.ShortExcercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountWords {
    public static Map<String, Integer> countWords(List<String> words){
        Map<String,Integer> returnWordsCounted=new HashMap<>();
        Integer count=0;
        for(String word:words){
            count=0;
            for (int i=0;i< words.size();i++){
                if (word.equals(words.get(i))){
                    count++;
                }
            }
            returnWordsCounted.put(word,count);
        }
        return  returnWordsCounted;
    }
}
