package Lessons;

import Lessons.UnitTesting.InvalidPriceException;
import Lessons.UnitTesting.Product;
import Lessons.UnitTesting.ShoppingCart;
import Lessons.UnitTesting.User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class TestUnit {
    public User user;

    void createShoppingCard1() {
        Product product1 = new Product("banana", 10);
        Product product2 = new Product("mere", 20);
        Product product3 = new Product("paine", 30);
        Product product4 = new Product("Lapte", 40);
        Product[] products = new Product[]{product1, product2, product3, product4};
        shoppingCart = new ShoppingCart(products);
    }

    @Mock
    ShoppingCart shoppingCart;

    @BeforeEach
    void createUser() {
        String username = "Jhon";
        String paswword = "1234abcd";
        user = new User(username, paswword);
    }
/*

   @BeforeEach
    void createShoppingCard(){
        Product product1=new Product("banana",10);
        Product product2=new Product("mere",20);
        Product product3=new Product("paine",30);
        Product product4=new Product("Lapte",40);
        Product[]products=new Product[]{product1,product2,product3,product4};
        shoppingCart=new ShoppingCart(products);
    }
*/

    @Test
    void testGenerateInvoice_ShouldReturnCorrectText() throws InvalidPriceException {
        when(shoppingCart.computeTotalPrice()).thenReturn(40.0);
        String invoiceText = user.generateInvoice();
        assertEquals("John payed 40.0 euros.", invoiceText);
    }

}
