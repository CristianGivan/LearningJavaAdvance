package Exercise;

import Exercise.Bag.Bag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBag {
    Bag bag =new Bag("bag1",10);

    @Test
    @DisplayName("The item was added")
    void testBagAdded_shouldAddTHeBag(){
    bag.addItemIfPossible("smallItem",4);
    int result= bag.getLeftVolume();
    assertEquals(6,result);
    }
    @Test
    @DisplayName("The item was not added")
    void testBagAdded_shouldNotAddTHeBag(){
        bag.addItemIfPossible("bigItem",44);
        int result= bag.getLeftVolume();
        assertEquals(10,result);
    }
    @Test
    @DisplayName("The item was deleted")
    void testBagDelete_shouldDeleteTheItemFromBag(){
        bag.addItemIfPossible("smallItem",4);
        bag.addItemIfPossible("smallItem1",1);
        bag.addItemIfPossible("smallItem2",4);
        bag.deleteItemFromBag("smallItem1");
        System.out.println(bag.getLeftVolume());
        int result= bag.getLeftVolume();
        System.out.println(bag.getLeftVolume());
        assertEquals(2,result);

    }
}
