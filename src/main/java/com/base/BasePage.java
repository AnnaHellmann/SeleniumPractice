package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public static WebDriver driver;

    public void setDriver(WebDriver driver)
    {
        BasePage.driver = driver;
    }

    protected WebElement find (By locator) //protected access modifier, because i want to use it from BasePage and all page object classes
    {
        return driver.findElement(locator);
    }

    protected void set(By locator, String text) //uniwersalna metoda symulacji wpisywania tekstu
    {
        find(locator).clear(); //usuniecie tekstu, jesli jakis sie znajdowal w polu
        find(locator).sendKeys(text); //symulacja wpisywanie nowego tekstu na klawiaturze
    }

    protected void click(By locator)
    {
        find(locator).click();
    }

    public static void delay(int millis)
    {
        try{
            Thread.sleep(millis);
        } catch(InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}
