package part3_4.com.demoqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks(){
        var linksPage = homePage.goToElements().goToLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        String expectedResponse = "Link has responded with staus 400 and status text Bad Request";
        Assert.assertEquals(actualResponse, expectedResponse);
    }

    @Test
    public void testLinksv2(){
        var linksPage = homePage.goToElements().goToLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"), "Actual response: " + actualResponse);
    }
}
