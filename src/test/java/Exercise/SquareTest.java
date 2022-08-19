package Exercise;

import Exercise.ShortExcercise.Square;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    @DisplayName("Square the list 1 2 3 sould optein 1 4 9")
    void testSquare_ShouldResultRightNumbers() {
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Integer> resultIntegers = Arrays.asList(1, 4, 9);
        List<Integer> result = Square.squareList(integers);
        assertEquals(resultIntegers, result);

    }
}
