package divyabhaskar;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 25/04/2017.
 */
public class MyStepdefs {

    WebDriver driver;

    @Given("^The user is on home page$")
    public void The_user_is_on_home_page() {
        driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.divyabhaskar.co.in/");



    }

    @When("^The user click on surat$")
    public void The_user_click_on_surat() {
        driver.findElement(By.linkText("Surat")).click();


    }

    @Then("^The user should nevigate to surat page sucessfully$")
    public void The_user_should_nevigate_to_surat_page_sucessfully() {
    Assert.assertTrue("You are not on requested page", driver.getCurrentUrl().contains("surat"));
    }
}
