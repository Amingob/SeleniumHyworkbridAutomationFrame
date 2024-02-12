package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

public class BaseTest {

    WebDriver wdriver;

    public void setUp(){
        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        wdriver = new EdgeDriver();

        wdriver.manage().window().maximize();
        wdriver.manage().deleteAllCookies();

        wdriver.get("https://demo.guru99.com/v4/");

        Reporter.log("*****   Test Case Has Started    *****");

    }
    public void tearDown(){

        wdriver.quit();
    }
}
