package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Profile {

    final WebDriver driver;

    //Constructor, as every page needs a Webdriver to find elements
    public Profile(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBys({
            @FindBy(className="mr-sm-2"),
            @FindBy(id="userName")
    })
    WebElement user;

    @CacheLookup
    @FindBy(id="submit")
    WebElement logoutBtn;

    //Method to check logged in username
    public String verifyUser(){
        return  user.getText();
    }

    //method to logout
    public void logOut(){
        System.out.println("Let's log off now!!!!");
        logoutBtn.click();
    }
}
