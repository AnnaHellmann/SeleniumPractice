package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
//import com.utilities.JavaScriptUtility.*;
import static com.utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsFrameWindowsPage extends HomePage {
    private By modalDialogsCard = By.xpath("//span[text()='Modal Dialogs']");

    public ModalDialogsPage goToModalDialogs(){
        scrollToElementJS(modalDialogsCard);
        click(modalDialogsCard);
        return new ModalDialogsPage();
    }
}
