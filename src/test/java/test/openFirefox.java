package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import javax.xml.bind.Element;
import java.util.List;
import java.util.Set;

public class openFirefox {
    @Test
    public void openFifox() {
        WebDriver webDriver = new FirefoxDriver();
                webDriver.get("http://www.baidu.com");
//        WebElement webElement = webDriver.findElement(By.linkText("百度一下"));

    }
@Test
    public void openFirefox(){
    System.setProperty("webdriver.gecko.driver", "D:\\wp\\demo\\drivers\\geckodriver.exe");
    WebDriver webDriverF = new FirefoxDriver();
    webDriverF.get("http://www.baidu.com");
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println( webDriverF.getTitle());
    webDriverF.navigate().back();
    webDriverF.quit();






}

@Test
public void openChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver webDriverC = new ChromeDriver();
        webDriverC.get("http://www.baidu.com");
  //  WebElement webElement = webDriverC.findElement(By.linkText("百度一下"));
}
@Test
public void opendIE(){
    System.setProperty("webdriver.ie.driver","D:\\wp\\demo\\drivers\\IEDriverServer.exe");
    WebDriver webDriverI = new InternetExplorerDriver();
    webDriverI.get("http://www.baidu.com");
}

}