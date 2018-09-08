package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class alertDilog {
    WebDriver webDriverC;

    @BeforeTest
    public void openChrome() {
        System.setProperty ("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        webDriverC = new ChromeDriver ();

    }

    @AfterMethod
    public void close() {
        webDriverC.quit ();
    }
}