package shopping;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void testEmptyCart() {
        assertEquals(0, cart.getProductCount());
    }

    @Test
    public void testAddOneProduct() {
        Product oliveOil = new Product("Olive Oil", 30);
        cart.addProduct(oliveOil, 1);
        assertEquals(1, cart.getProductCount());
        assertEquals(30, cart.getTotalValue());
    }

    @Test
    public void testAddDifferentProducts() {
        Product oliveOil = new Product("Olive Oil", 30);
        Product soap = new Product("Soap", 10);
        cart.addProduct(oliveOil, 1);
        cart.addProduct(soap, 1);
        assertEquals(2, cart.getProductCount());
        assertEquals(40, cart.getTotalValue());
    }
    @Test
    public void testCheckNameAndPrice() {
        Product product = new Product("Test Product", 50);
        cart.addProduct(product, 1);
        assertEquals("Test Product", cart.getProduct(0).getName());
        assertEquals(50, cart.getProduct(0).getUnitPrice());
    }

}
