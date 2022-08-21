package Exercise;

import Exercise.Stock.Stock;
import Exercise.Stock.Symbol;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestStock {
    Map<String,Integer> symbols = new HashMap<>();
    Stock stock;

    @BeforeEach
    void initStock() {
        Symbol symbol1 = new Symbol("Oracle", 129);
        Symbol symbol2 = new Symbol("Google", 421);
        Symbol symbol3 = new Symbol("Tesla", 950);
        symbols.put(symbol1.getName(),symbol1.getPrice());
        symbols.put(symbol2.getName(),symbol2.getPrice());
        symbols.put(symbol3.getName(),symbol3.getPrice());
        stock =new Stock("stock",symbols);
    }

    @Test
    @DisplayName("The maximum sock should be 950")
    void testBiggestPrice_ShouldReturn950(){
        Integer result =stock.biggestPrice();
        assertEquals(950,result);
    }
    @Test
    @DisplayName("The mean sock should be 500")
    void testMeanPrice_ShouldReturn500(){
        Integer result =stock.meanPrice();
        assertEquals(500,result);
    }
}
