package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginDemo {
    WebDriver webDriver;
    @BeforeTest
    public void open(){
        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "D:\\wp\\demo\\drivers\\geckodriver.exe");
        webDriver = new ChromeDriver ();
        webDriver.get ("http://www.mail.163.com");
    }
    @Test
    public void loginSucess(){
        WebDriverWait webDriverWait = new WebDriverWait (webDriver,10);
        webDriverWait.until (ExpectedConditions.presenceOfElementLocated (By.id("x-URS-iframe")));
        /*try {
            Thread.sleep (3000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }*/
        webDriver.switchTo ().frame ("x-URS-iframe");
        webDriver.findElement (By.name ("email")).sendKeys ("meyoungtester");
        webDriver.findElement (By.name ("password")).sendKeys ("meyoung123");
        webDriver.findElement (By.id("dologin")).click ();
        WebDriverWait webDriverWait2 = new WebDriverWait (webDriver,10);
         // webDriver.manage ().timeouts ().implicitlyWait (5, TimeUnit.SECONDS);
    }
    public  void close()throws  InterruptedException{

        Thread.sleep (5000);
        webDriver.quit ();
    }
}
