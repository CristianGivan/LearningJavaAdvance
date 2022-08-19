package Exercise;

import Exercise.ShortExcercise.CountWords;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestCountWords {
    @Test
    @DisplayName("Display words count")
    void testCountWords_ShouldReturnTheCorrectCount() {
        List<String> words = Arrays.asList("ana", "are", "mere", "are");
        Map<String, Integer> expectedResult = Map.of(
                "ana", 1, "are", 2, "mere", 1);
        Map<String, Integer> result = CountWords.countWords(words);
        assertEquals(expectedResult, result);
        System.out.println(result);
    }
}
