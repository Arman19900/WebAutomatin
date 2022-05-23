
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Login;
import pages.Profile;


public class LoginTest {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/login");
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void login(){

        //Instantiating Login & Profile page using initElements()
        Login loginPg = new Login(driver);
        Profile profilePg = new Profile(driver);
        //Using the methods created in pages class to perform actions

        loginPg.LogIn("---your username---", "---your password---");

        profilePg.logOut();

        driver.quit();
    }

}