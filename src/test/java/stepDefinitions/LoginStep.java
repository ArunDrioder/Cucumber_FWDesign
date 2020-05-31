package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginStep
{
    public static WebDriver driver;
    public static LoginPage loginPage;


    @Given("User launches the chrome browser")
    public void user_launches_the_chrome_browser()
    {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();

        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);
    }

    @When("User launches the URL {string}")
    public void user_launches_the_URL(String url)
    {
        driver.get(url);

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @Then("User enters the login Email address as {string}")
    public void user_enters_the_login_Email_address_as(String email)
    {
        loginPage.setEmailElement(email);

    }




    @Then("User enters the password as {string}")
    public void user_enters_the_password_as(String password)
    {
        loginPage.setPasswordElement(password);

    }

    @Then("User Clicks the Login Button")
    public void user_Clicks_the_Login_Button()
    {


        loginPage.clickLoginBtn();

    }

    @Then("Close browser")
    public void close_browser() throws InterruptedException {
        Thread.sleep(5000);

        driver.quit();

    }

}
