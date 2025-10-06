package part3_4.com.demoqa.test.part4.alerts;

import com.demoqa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.base.BasePage.delay;
import static com.utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {
    @Test
    public void informationAlertTest() {
        var alertsPage = new HomePage().goToAlertsFrameWindows().goToAlertsPage();
        alertsPage.clickInformationAlertButton();
        String expectedAlertText = "You clicked a button";
        Assert.assertEquals(getAlertText(), expectedAlertText);
        acceptAlert();
    }

    @Test
    public void confirmationAlertTest() {
        var alertsPage = new HomePage().goToAlertsFrameWindows().goToAlertsPage();
        alertsPage.clickConfirmationAlertButton();
        acceptAlert();
        String actualAcceptedAlertResponse = alertsPage.getConfirmationResult();
        Assert.assertTrue(actualAcceptedAlertResponse.contains("Ok"));
        delay(5000);
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualDismissedAlertResponse = alertsPage.getConfirmationResult();
        Assert.assertTrue(actualDismissedAlertResponse.contains("Cancel"));
    }
    @Test
    public void promptAlertTest() {
        var alertsPage = new HomePage().goToAlertsFrameWindows().goToAlertsPage();
        alertsPage.clickPromptAlertButton();
        String text = "Ania";
        passString(text);
        acceptAlert();
        String actualPromptAlertButtonResult = alertsPage.getPromptAlertButtonResult();
//        Assert.assertTrue(actualPromptAlertButtonResult.contains(text));
        Assert.assertEquals(actualPromptAlertButtonResult, "You entered "+text);
    }
}
