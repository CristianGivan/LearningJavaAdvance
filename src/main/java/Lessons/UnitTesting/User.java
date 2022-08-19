package Lessons.UnitTesting;

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
            /*Product product1=new Product("banana",10);
            Product product2=new Product("mere",20);
            Product product3=new Product("paine",30);
            Product product4=new Product("Lapte",40);
            Product[]products=new Product[]{product1,product2,product3,product4};
            shoppingCart=new ShoppingCart(products);
*/
        double price = shoppingCart.computeTotalPrice();
        return this.username + " payed " + price + " euros.";
    }
}
