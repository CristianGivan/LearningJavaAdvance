package Exercise;

import Exercise.ShortExcercise.SuperSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
public class TestSuperSet {
    @Test
    @DisplayName("Should be seen a superset")
    void TestSuperTest_ShouldBeSuperTest(){
        Set<String> subSet =Set.of("ana","are","mere");
        Set<String> superSet =Set.of("ana","are");
       assertTrue(SuperSet.checkIfIsSuperSet(subSet,superSet));

    }
    @Test
    @DisplayName("Should be seen a superset")
    void TestSuperTest_ShouldNotBeSuperTest(){
        Set<String> subSet =Set.of("ana","are","mere");
        Set<String> superSet =Set.of("ana","are","mere");
        assertFalse(SuperSet.checkIfIsSuperSet(subSet,superSet));

    }
}
