package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.utilities.DropDownUtility.*;
import static com.utilities.JavaScriptUtility.*;

public class SelectMenuPage extends WidgetsPage{
    private By standardMultiSelect = By.id("cars");
    public void selectStandardMultiSelect(String text) {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
    }
    public void selectStandardMultiSelect(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMultiSelect(String value){
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }
    public List<String> getAllSelectedStandardMultiOptions(){
        return getAllSelectedOptions(standardMultiSelect);
    }
}
