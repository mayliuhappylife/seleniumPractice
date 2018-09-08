package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class GridTest {
    @Test
    public void TestChrome() throws InterruptedException, MalformedURLException {
        DesiredCapabilities chr =  DesiredCapabilities.firefox ();
        WebDriver webDriver = new RemoteWebDriver (new URL ("http://192.168.1.197:5555/wd/hub"),chr);
        webDriver.get ("http://www.baidu.com");
        Thread.sleep (5000);
        webDriver.quit ();


    }
    @DataProvider(name = "data4")
    public Object[][] data() {
        return new Object[][]{
                {"firefox"},
                {"chrome"},
                {"ie"}
        };
    }

    @Test(dataProvider = "data4")
    public void TestData(String driver) throws InterruptedException, MalformedURLException {
        DesiredCapabilities chr =  DesiredCapabilities.firefox ();
        WebDriver webDriver = new RemoteWebDriver (new URL ("http://192.168.1.197:5555/wd/hub"),chr);
        webDriver.get ("http://www.baidu.com");
        Thread.sleep (5000);
        webDriver.quit ();


    }
}

