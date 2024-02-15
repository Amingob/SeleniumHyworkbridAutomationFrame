package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver )
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
    @CacheLookup
    WebElement userName;

    @FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input")
    @CacheLookup
    WebElement passWord;

    @FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
    @CacheLookup
    WebElement loginBtn;

    public void submitUserName(String txtUserName){
        userName.sendKeys(txtUserName);
    }

    public void submitPassword(String txtPassWord){
        passWord.sendKeys(txtPassWord);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }
}
