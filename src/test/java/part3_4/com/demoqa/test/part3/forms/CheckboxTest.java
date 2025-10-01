package part3_4.com.demoqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToForms().goToPracticeForm();
        formsPage.clickSubmitButton();
        formsPage.clickReadingCheckbox();
        formsPage.clickSportsCheckbox();
        formsPage.unclickReadingCheckbox();
        boolean isReadingSelected = formsPage.isReadingCheckboxSelected();
        boolean isSportsSelected = formsPage.isSportsCheckboxSelected();
        Assert.assertTrue(isSportsSelected, "Sports checkbox is not selected");
        Assert.assertFalse(isReadingSelected, "Reading checkbox is selected");
    }

}
