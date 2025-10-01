package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {
    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PracticeFormPage goToPracticeForm(){
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
