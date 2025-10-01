package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTests extends BaseTest {
    @Test
    public void testProductHeaderIsDisplayed()
    {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductHeaderDisplayed(), "Product header is not displayed"); //message displayes if test fails
    }
}
