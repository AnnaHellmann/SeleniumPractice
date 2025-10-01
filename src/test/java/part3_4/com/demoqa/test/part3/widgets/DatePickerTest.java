package part3_4.com.demoqa.test.part3.widgets;

//import com.demoqa.pages.widgets.DatePickerPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DatePickerTest extends BaseTest {
    @Test
    public void datePickerTest() {
        var datePickerPage = homePage.goToWidgets().goToDatePicker();
        datePickerPage.selectDate("September", "2025", "22");
        String actualDate = datePickerPage.getDate();
        System.out.println(actualDate);
        Assert.assertEquals(actualDate, "09/22/2025", "expected date: 09/22/2025, actual date: "+ actualDate);
        //22 zamiast 022 i dropdownutility wykorzystac getAllSelectedOptions
    }
}
