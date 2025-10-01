package part2.com.saucedemo.base;

import com.base.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver webdriver;
    protected LoginPage loginPage;
    protected BasePage basePage;

    private String url = "https://www.saucedemo.com";

    @BeforeClass
    public void setUp() {
        webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get(url);
        basePage = new BasePage();
        basePage.setDriver(webdriver);
        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown() {
//        webdriver.quit();
    }





}
