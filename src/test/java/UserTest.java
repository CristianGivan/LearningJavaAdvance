import UnitTesting.InvalidPriceException;
import UnitTesting.ShoppingCart;
import UnitTesting.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
public class UserTest {
    public User user;

    @Mock
    private ShoppingCart shoppingCart;
    @BeforeEach
    void createUser(){
        String username="Jhon";
        String paswword="1234abcd";
        user=new User(username,paswword);
    }
    void testGenerateInvoice_ShouldReturnCorrectText()throws InvalidPriceException{
        when(shoppingCart.computeTotalPrice()).thenReturn(40.0);
        String invoiceText = user.generateInvoice();
        assertEquals("John payed 40.0 euros.", invoiceText);
    }
}
