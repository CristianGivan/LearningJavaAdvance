package Exercise;

import Exercise.ShortExcercise.LongestWord;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TesLongestWord {
    @Test
    @DisplayName("The longest word is mere")
    void testLongestWord_ShouldReturnTheLongestWord() {
        List<String> stringList = Arrays.asList("ana", "are","mere");
        String result = LongestWord.findMaximumLengthWord(stringList);
        System.out.println(stringList);
        System.out.println(result);
        // assertEquals
        assertEquals("mere", result);
    }
}
