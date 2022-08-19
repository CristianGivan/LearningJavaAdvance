package Lessons;

import Lessons.UnitTesting.Calculator;
import Lessons.UnitTesting.DividedByZero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCalculator {
    public Calculator calculator;
/*    @BeforeEach
    void beforeEach(){
        System.out.println("Before all test it should be created a new object calculator");
        Calculator calculator = new Calculator();
    }*/

    @BeforeEach
    void creatingCalculator() {
        System.out.println("Before all test it should be created a new object calculator");
        calculator = new Calculator();
    }

    @Test
    @DisplayName("when adding 1 by 3 the result should be 4")
    void testAddition() {
        //given
        //Calculator calculator = new Calculator();
        //when
        int result = calculator.add(1, 3);
        //then
        assertEquals(4, result);
    }

    @Test
    @DisplayName("When divide 8 by 2 the result should be 4")
    void testDividing_ShouldReturnCorrectValue() {
        //Calculator calculator = new Calculator();
        try {
            int result = calculator.divide(8, 2);
            assertEquals(4, result);
        } catch (DividedByZero e) {
            System.out.println(e.getMessage());
            fail("excception thrown");
        }

    }

    @Test
    @DisplayName("When divided by o an exception should be thrown")

    void testDivision_SouldThrowAnExcceptio() {
        //Calculator calculator=new Calculator();
        try{
            int result = calculator.divide(8,0);
            fail("exxception not throw");
        }catch (DividedByZero e){
            assertEquals("The number cannot be divided by zero",e.getMessage());
        }

    }

}
