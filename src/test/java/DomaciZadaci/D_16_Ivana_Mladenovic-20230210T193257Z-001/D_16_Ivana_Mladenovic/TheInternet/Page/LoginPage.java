package TheInternet.Page;

import TheInternet.Base.LoginBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginBaseTest {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(id = "username")
    WebElement Username;

    public @FindBy(id = "password")
    WebElement Password;

    public @FindBy(className = "radius")
    WebElement LoginButton;

    public @FindBy(id = "flash")
    WebElement notification;


    public void insertUsername(String username) {
        Username.clear();
        Username.sendKeys(username);
    }

    public void insertPassword(String password) {
        Password.clear();
        Password.sendKeys(password);
    }

    public void clickOnLoginButton() {
        LoginButton.click();
    }

}
