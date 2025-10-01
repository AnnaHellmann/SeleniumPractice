package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private By selectMenuButton = By.xpath("//span[text()='Select Menu']");
    private By datePickerButton = By.xpath("//span[text()='Date Picker']");
    public SelectMenuPage goToSelectMenu(){
        scrollToElementJS(selectMenuButton);
        click(selectMenuButton);
        return new SelectMenuPage();
    }

    public DatePickerPage goToDatePicker(){
        scrollToElementJS(datePickerButton);
        click(datePickerButton);
        return new DatePickerPage();
    }
}
