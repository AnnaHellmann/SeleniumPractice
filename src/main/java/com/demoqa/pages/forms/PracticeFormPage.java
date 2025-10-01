package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage{
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbiesCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbiesCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbiesCheckbox = By.id("hobbies-checkbox-3");
    private By submitButton = By.id("submit");
public void clickFemaleRadioButton() {
    scrollToElementJS(femaleRadioButton);
    clickJS(femaleRadioButton);
}

public boolean isFemaleRadioButtonSelected()
{
    return find(femaleRadioButton).isSelected();
}
    public void clickSportsCheckbox() {
        if(!find(sportsHobbiesCheckbox).isSelected()){
            scrollToElementJS(sportsHobbiesCheckbox);
            clickJS(sportsHobbiesCheckbox);
        }
    }
    public void clickReadingCheckbox() {
        if(!find(readingHobbiesCheckbox).isSelected()){
            scrollToElementJS(readingHobbiesCheckbox);
            clickJS(readingHobbiesCheckbox);
        }
    }
    public void clickMusicCheckbox() {
        if(!find(musicHobbiesCheckbox).isSelected()){
            scrollToElementJS(musicHobbiesCheckbox);
            clickJS(musicHobbiesCheckbox);
        }
    }
    public void unclickReadingCheckbox() {
        if(find(readingHobbiesCheckbox).isSelected()){
            scrollToElementJS(readingHobbiesCheckbox);
            clickJS(readingHobbiesCheckbox);
        }
    }

    public void clickSubmitButton() {
        click(submitButton);
    }

    public boolean isReadingCheckboxSelected() {
        return find(readingHobbiesCheckbox).isSelected();
    }
    public boolean isSportsCheckboxSelected() {
        return find(sportsHobbiesCheckbox).isSelected();
    }
}
