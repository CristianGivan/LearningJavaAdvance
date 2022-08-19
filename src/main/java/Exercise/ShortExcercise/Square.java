package Exercise.ShortExcercise;

import java.util.ArrayList;
import java.util.List;

public class Square {
    List<Integer> integers=new ArrayList<>();

    public static List<Integer> squareList(List<Integer> integerList){
        List<Integer> returnList=new ArrayList<>();
        for(Integer integer:integerList){
            returnList.add((int) Math.pow(integer,2));
        }
        return returnList;
    }
}
