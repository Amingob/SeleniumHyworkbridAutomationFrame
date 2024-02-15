package testcases;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    public String expectedTitle = "Guru99 Bank Manager HomePage";
    public String expectedTitle1 = "Guru99 Bank Manager HomePage1";

    @Test
    public void tc_001_loginUsingValidCredentials(){

        loginPage = new LoginPage(wdriver);
        loginPage.submitUserName(userNameStr);
        loginPage.submitPassword(passWordStr);
        loginPage.clickLoginBtn();

        //Asserting the title of the page

        String actualTitle = wdriver.getTitle();

        if(expectedTitle1.equals(actualTitle)){
            Assert.assertTrue(true,"Title of the page is correct");
        }else
            Assert.assertTrue(false,"Title of the page is incorrect");

    }

    @Test
    public void tc_002_loginUsingValidCredentials(){

        loginPage = new LoginPage(wdriver);
        loginPage.submitUserName(userNameStr);
        loginPage.submitPassword(passWordStr);
        loginPage.clickLoginBtn();

        //Asserting the title of the page

        String actualTitle = wdriver.getTitle();

        if(expectedTitle1.equals(actualTitle)){
            Assert.assertTrue(true,"Title of the page is correct");
        }else
            Assert.assertTrue(false,"Title of the page is incorrect");


    }
}
