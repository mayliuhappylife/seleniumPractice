package test;

import javafx.scene.input.DataFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login  {
    WebDriver webDriver;

    @BeforeTest
    public void open() {
        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "D:\\wp\\demo\\drivers\\geckodriver.exe");
        webDriver = new ChromeDriver ();
        webDriver.get ("http://www.mail.163.com");
    }
    @Test
    public void getUrl(){
       // webDriver.switchTo().frame ("x-URS-iframe");
        try {
            Thread.sleep (3000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        webDriver.switchTo ().frame ("x-URS-iframe");
      webDriver.findElement (By.id ("changepage")).click ();
        String handle = webDriver.getWindowHandle ();
        for(String handles :webDriver.getWindowHandles ()){
            if(handles.equals (handle)){
                continue;
            }
            webDriver.switchTo ().window (handles);

        }
         Long longs = System.currentTimeMillis ();
        String phone = String.valueOf (longs/100);
        webDriver.findElement (By.id ("nameIpt")).sendKeys ("testn"+longs/100);
        webDriver.findElement (By.id("mainPwdIpt")).sendKeys ("dafadg12345");
        webDriver.findElement (By.id ("mainCfmPwdIpt")).sendKeys ("dafadg12345");
        webDriver.findElement (By.id("mainMobileIpt")).sendKeys (phone);
        webDriver.findElement (By.id("vcodeIpt")).sendKeys ("123456");
        webDriver.findElement (By.id ("mainAcodeIpt")).sendKeys ("123456");
//        webDriver.findElement (By.id ("mainAcceptIpt")).click ();
        webDriver.findElement (By.id ("mainRegA")).click ();
        WebDriverWait webDriverWait = new WebDriverWait (webDriver,10);
        webDriverWait.until (ExpectedConditions.presenceOfElementLocated (By.xpath ("//*[@id=\"m_mainAcode\"]/span")));
        String errors = webDriver.findElement (By.xpath ("//*[@id=\"m_mainAcode\"]/span")).getText ();
        Assert.assertEquals (errors,"  手机验证码不正确，请重新填写");



    }
    @AfterTest
    public void close()throws  InterruptedException{
        Thread.sleep (3000);
        webDriver.quit ();

    }
}
