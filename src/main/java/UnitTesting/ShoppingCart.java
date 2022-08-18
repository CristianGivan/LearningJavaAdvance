package UnitTesting;

public class ShoppingCart {
    private Product[] productList;

    //getters, setters

    public double computeTotalPrice() throws InvalidPriceException {
        double total = 0;
        for (int i = 0; i < productList.length; i++) {
            if (productList[i].getPrice()<=0){
                throw new InvalidPriceException("One of the products has a wrong price");
            }
            total += productList[i].getPrice();
        }
        return total;
    }
}
