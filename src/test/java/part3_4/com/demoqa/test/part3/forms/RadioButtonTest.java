package part3_4.com.demoqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().goToPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleSelected = formsPage.isFemaleRadioButtonSelected();
        Assert.assertTrue(isFemaleSelected, "Female radio button is not selected");
    }



}
