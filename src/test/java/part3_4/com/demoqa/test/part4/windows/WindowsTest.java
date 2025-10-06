package part3_4.com.demoqa.test.part3.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static com.utilities.GetUtility.*;

public class WindowsTest extends BaseTest {
    @Test
    public void windowsTest() {
        var windowsPage = new HomePage().goToAlertsFrameWindows().goToWindowsPage();
        windowsPage.clickWindowButton();
        windowsPage.switchToNewWindow();
        String actualHeading = windowsPage.getWindowHeading();
        String expectedHeading = "This is a sample page";
        Assert.assertEquals(actualHeading, expectedHeading);
        String actualURL = getCurrentURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL, expectedURL);
    }
}
