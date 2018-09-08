package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import static java.awt.event.KeyEvent.VK_CONTROL;
import static java.awt.event.KeyEvent.VK_ENTER;
import static java.awt.event.KeyEvent.VK_S;

public class rightclick {
    WebDriver driver;
    @BeforeTest
    public void startChro(){

        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        driver = new ChromeDriver ();
    }
    @Test
    public void rightCl()throws InterruptedException{
        driver.get ("http://www.baidu.com");
        WebElement webElement = driver.findElement (By.id ("su"));
        Actions action = new Actions (driver);
        action.contextClick (webElement).perform ();
        webElement.sendKeys ("rtest");
        Thread.sleep (5000);
        action.doubleClick (webElement).perform ();
        }
        @Test
        public void moveEle() throws InterruptedException{
        driver.get("http://www.baidu.com");
        WebElement webEl = driver.findElement (By.id ("su"));
        String wels = webEl.getText ();
        Actions adt = new Actions (driver);
        adt.moveToElement (webEl).perform ();
        Thread.sleep (5000);
        Assert.assertEquals (wels,"sttt");

    }
    @Test
    public void dragEle() throws  InterruptedException{
        driver.get ("file:///D:/selenium_html/dragAndDrop.html");
        WebElement webElement = driver.findElement (By.id ("drag"));
        WebElement webElemO = driver.findElement (By.xpath ("/html/body/h1"));
        Thread.sleep (3000);
        Actions actions = new Actions (driver);
        actions.clickAndHold (webElement).moveToElement (webElemO).release (webElement).perform ();
        Thread.sleep (3000);


    }
@Test
    public void Ldx() throws  InterruptedException{
        driver.get ("file:///D:/selenium_html/index.html");
        Actions builds = new Actions (driver);
        WebElement webElement = driver.findElement (By.id ("selectWithMultipleEqualsMultiple"));
        List<WebElement> list = webElement.findElements (By.tagName ("option"));
           Actions multbuilds = builds.keyDown (Keys.CONTROL)
                   .click (list.get (2))
                   .keyUp (Keys.CONTROL);
           multbuilds.perform ();
        Thread.sleep (3000);
    }
    @Test
    public void ConS() throws AWTException,InterruptedException{
        driver.get ("http://www.baidu.com");
        Robot robot = new Robot ();
        robot.keyPress (VK_CONTROL);
        robot.keyPress (VK_S);
        Thread.sleep (2000);
        robot.keyPress (VK_ENTER);
    }
    @Test
    public void upLoad() throws InterruptedException{
        driver.get ("file:///D:/selenium_html/index.html");
        WebElement upload = driver.findElement (By.id("load"));
               upload.sendKeys ("D:\\pom.xml");

    }
        @AfterTest
    public void close() throws InterruptedException{
        Thread.sleep (5000);
       // driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        driver.quit ();
        }
    }

