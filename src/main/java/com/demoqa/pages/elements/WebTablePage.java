package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtility.scrollToElementJS;

public class WebTablePage extends ElementsPage{
    By registrationAgeField = By.xpath("//div[@id='age-wrapper']//input[@id='age']");
    By submitButton = By.xpath("//button[@id='submit']");
    public void clickEdit(String email){
        By edit = By.xpath("//div[text()='"+email+"']//following::span[@title='Edit']");
        scrollToElementJS(edit);
        click(edit);
    }

    public void passAge(String age){
        set(registrationAgeField, age);
    }

    public void clickSubmit(){
        click(submitButton);
    }

    public String agePassed(String email){
        By ageBlock = By.xpath("//div[text()='"+email+"']//preceding::div[1]");
        return find(ageBlock).getText();
    }
}
