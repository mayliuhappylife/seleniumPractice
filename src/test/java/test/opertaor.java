package test;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class opertaor {
    WebDriver webDriverC;
    @BeforeTest
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        webDriverC = new ChromeDriver();

    }

//    @Test
//     public void clickdemo(){
//       webDriverC.get("https://www.baidu.com");
//        WebElement webElement = webDriverC.findElement(By.name("tj_trnews"));
//        webElement.click();
//        String Url = webDriverC.getCurrentUrl();
//        Assert.assertEquals(Url,"http://news.baidu.com/","link true"
//                );
//        webDriverC.quit();

 //   }
    @Test
    public void sentKeys()throws InterruptedException{
        webDriverC.get("https://www.baidu.com");
         WebElement webEd  =webDriverC.findElement(By.id("kw"));
       webEd.sendKeys("ewqfg");
       WebElement websu = webDriverC.findElement(By.id("su"));
        websu.click();
        Thread.sleep (3000);
        String title = webDriverC.getTitle();
        Assert.assertEquals(title,"ewqfg_百度搜索");
        Thread.sleep (3000);
        webEd.clear ();
        Thread.sleep (2000);

    }
    @Test
    public void takeScrenn() throws InterruptedException{
        webDriverC.get ("http://www.baidu.com");
        File screnn = ((TakesScreenshot)webDriverC).getScreenshotAs (OutputType.FILE);
        try{
            FileUtils.copyFile(screnn,new File ("D:\\111.png"));

        }catch (IOException e){

        }
    }
    @AfterMethod
    public void close(){
        webDriverC.quit();
  }

}
