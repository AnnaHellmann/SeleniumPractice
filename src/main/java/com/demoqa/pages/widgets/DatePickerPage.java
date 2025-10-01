package com.demoqa.pages.widgets;

import static com.utilities.JavaScriptUtility.*;
import static com.utilities.DropDownUtility.*;
import org.openqa.selenium.By;


public class DatePickerPage extends WidgetsPage{
private By selectDateField = By.id("datePickerMonthYearInput");
private By selectMonthField = By.className("react-datepicker__month-select");
private By selectYearField = By.className("react-datepicker__year-select");

public void selectMonth(String month){
    selectByVisibleText(selectMonthField, month);
}
public void selectYear(String year){
    selectByVisibleText(selectYearField, year);
}

public void selectDay(String day){
    click(By.className("react-datepicker__day--0"+day));
}

public void selectDate(String month, String year, String day){
    scrollToElementJS(selectDateField);
    click(selectDateField);
    selectMonth(month);
    selectYear(year);
    selectDay(day);
}

public String getDate(){
    return find(selectDateField).getAttribute("value");
}
}
