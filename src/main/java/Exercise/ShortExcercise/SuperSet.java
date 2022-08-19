package Exercise.ShortExcercise;

import java.util.Set;

public class SuperSet {
    public static boolean checkIfIsSuperSet(Set<String> subSet, Set<String> superSet) {
        boolean isSupeSet = false;

        for (String word : superSet) {
            if (!subSet.contains(word)) {
                isSupeSet = false;
                break;
            } else if (superSet.containsAll(subSet)) {
                isSupeSet = false;
                break;
            } else {
                isSupeSet = true;
            }
        }
        return isSupeSet;
    }
}
