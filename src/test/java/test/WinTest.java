package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WinTest {
    WebDriver driver;

    @BeforeTest
    public void openChrom(){
        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver ();
        driver.manage ().timeouts ().implicitlyWait (30, TimeUnit.SECONDS);
    }

    @Test
    public void Wintest() throws  InterruptedException{
        driver.get ("file:///D:/selenium_html/index.html");
        driver.findElement (By.linkText ("Open new window")).click ();
        String handle = driver.getWindowHandle ();
        for (String handles :driver.getWindowHandles ()){
            if(handles.equals (handle)){
                continue;}
            {
                driver.switchTo ().window (handles);
            }
            Thread.sleep (3000);

             //WebDriverWait.FIVE_HUNDRED_MILLIS.
                    driver.findElement (By.linkText ("baidu")).click ();
            Thread.sleep (3000);
            driver.close ();
            driver.switchTo ().window (handle);
            Thread.sleep (2000);
          WebDriverWait webDriverWait=  new WebDriverWait (driver,30);
                  webDriverWait.until (ExpectedConditions.presenceOfElementLocated (By.linkText ("")));
           // driver.findElement (By.name ("")).sendKeys ("");

        }

    }
    @AfterTest
    public void closeChrom() throws  InterruptedException{
        Thread.sleep (5000);
        driver.quit ();
    }
}
