package Exercise.Stock;

import java.util.Collections;
import java.util.Map;

public class Stock {
    private String name;
    private Map<String, Integer> symbols;

    public Stock(String name, Map<String, Integer> stock) {
        this.name = name;
        this.symbols = stock;
    }

    public Integer biggestPrice() {
        int maxPrice = -1;
        for (Map.Entry<String, Integer> entry : symbols.entrySet()) {
           // System.out.println(entry);
            if (entry.getValue() > maxPrice) {
                maxPrice = entry.getValue();
            }
        }
        return maxPrice;
    }
    public Integer meanPrice() {
        int meanPrice = -1;
        int totslPrice = 0;
        for (Map.Entry<String, Integer> entry : symbols.entrySet()) {
            // System.out.println(entry);

                totslPrice += entry.getValue();
        }
        meanPrice=totslPrice/ symbols.size();
        return meanPrice;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

