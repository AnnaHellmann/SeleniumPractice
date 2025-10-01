package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {
    private By webTableButton = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linksButton = By.xpath("//li[@id='item-5']//span[text()='Links']");

    public WebTablePage goToWebTablePage()
    {
        scrollToElementJS(webTableButton);
        click(webTableButton);
        return new WebTablePage();
    }

    public LinksPage goToLinks()
    {
        scrollToElementJS(linksButton);
        click(linksButton);
        return new LinksPage();
    }
}
