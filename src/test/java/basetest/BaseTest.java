package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class BaseTest {

    public WebDriver wdriver;
    public LoginPage loginPage;
    public String userNameStr = "mngr552005";
    public String passWordStr = "ujYbEda";

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        wdriver = new EdgeDriver();

        wdriver.manage().window().maximize();
        wdriver.manage().deleteAllCookies();

        wdriver.get("https://demo.guru99.com/v4/");

        Reporter.log("*****   Test Case Has Started    *****");

    }
    @AfterClass
    public void tearDown(){

        wdriver.quit();
    }
}
