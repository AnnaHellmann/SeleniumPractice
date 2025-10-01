package part3_4.com.demoqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {
    @Test
    public void testWebTable() {
        String email = "alden@example.com";
        var webTablePage = homePage.goToElements().goToWebTablePage();
        webTablePage.clickEdit(email);
        webTablePage.passAge("18");
        webTablePage.clickSubmit();
        String expectedAge = "18";
        String actualAge = webTablePage.agePassed(email);
        Assert.assertEquals(actualAge, expectedAge);
    }
}
