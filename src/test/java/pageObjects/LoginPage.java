package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    public static WebDriver driver;

    public LoginPage(WebDriver loginDriver)
    {
        driver = loginDriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Email")
    WebElement emailElement;

    @FindBy(id = "Password")
    WebElement passwordElement;

    @FindBy(xpath = "//input[@type = 'submit']")
    WebElement loginBtn;

    @FindBy(linkText = "Logout")
    WebElement logOutLink;

    public void setEmailElement(String email)
    {
        emailElement.clear();
        emailElement.sendKeys(email);
    }

    public void setPasswordElement(String password)
    {
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    public void clickLoginBtn()
    {
        loginBtn.click();
    }

    public void clickLogout()
    {
        logOutLink.click();
    }



}
