package part3_4.com.demoqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

import static com.base.BasePage.delay;

public class DropDownTest extends BaseTest{

    @Test
    public void testDropDown() {
        var widgetPage = homePage.goToWidgets().goToSelectMenu();
        widgetPage.selectStandardMultiSelect("Volvo");
        widgetPage.selectStandardMultiSelect("Audi");
        widgetPage.selectStandardMultiSelect(1);
        widgetPage.deselectStandardMultiSelect("audi");
        List<String> actualSelectedOptions = widgetPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertFalse(actualSelectedOptions.contains("Audi"));
    }
}
