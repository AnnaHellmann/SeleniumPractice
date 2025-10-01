package com.demoqa.pages.alerts_frames_windows;

import static com.utilities.JavaScriptUtility.scrollToElementJS;
import org.openqa.selenium.By;

public class ModalDialogsPage extends AlertsFrameWindowsPage{
    private By smallModal = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(@class,'modal-body') and contains(text(),'small modal')]");
    public void clickSmallModal(){
        scrollToElementJS(smallModal);
        click(smallModal);
    }
    public void closeSmallModal(){
        click(By.id("closeSmallModal"));
    }
    public String getSmallModalText(){
        return find(smallModalText).getText();
    }
}
