package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    final WebDriver driver;

    //Constructor, as every page needs a Webdriver to find elements
    public Login(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    //Locating the username text box
    @FindAll({
            @FindBy(id="wrapper"),
            @FindBy(id="userName")
    })
    WebElement username;

    //Locating the password text box
    @FindBy(id="password")
    WebElement pswd;

    //Locating Login Button
    @FindBy(id="login")
    WebElement loginBtn;


    //Method that performs login action using the web elements
    public void LogIn(String uName, String pwd){
        username.sendKeys(uName);
        pswd.sendKeys(pwd);
        loginBtn.click();
    }
}
