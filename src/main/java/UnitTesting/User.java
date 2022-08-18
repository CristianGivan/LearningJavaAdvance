package UnitTesting;

public class User   {
    private String username;
    private String password;
    private ShoppingCart shoppingCart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
//getters, setters

    public String generateInvoice() throws InvalidPriceException{
        double price = shoppingCart.computeTotalPrice();
        return this.username + " payed " + price + " euros.";
    }
}
