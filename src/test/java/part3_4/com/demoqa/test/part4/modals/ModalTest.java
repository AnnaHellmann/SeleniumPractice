package part3_4.com.demoqa.test.part3.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;


import static com.base.BasePage.delay;

public class ModalTest extends BaseTest {
    @Test
    public void testSmallModal(){
        var modalDialogsPage = new HomePage().goToAlertsFrameWindows().goToModalDialogs();
        modalDialogsPage.clickSmallModal();
        delay(2000);
        String actualSmallModalText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualSmallModalText.contains("small modal"), "text does not contain small modal");
        modalDialogsPage.closeSmallModal();
    } //nie dzialalo poniewaz small modal nawet nie zdazyl sie kompletnie wyswietlic a byla juz pobierana jego zawartosc
}
