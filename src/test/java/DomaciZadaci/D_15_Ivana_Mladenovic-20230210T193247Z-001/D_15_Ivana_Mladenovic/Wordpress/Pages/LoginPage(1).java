package DomaciZadaci.Wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    WebElement loginButton;
    WebElement username;
    WebElement continueButton;
    WebElement password;
    WebElement login;
    WebElement notification;


    public LoginPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public  WebElement getLoginButton () { return driver.findElement(By.linkText("Log In"));}

    public WebElement getUsername() {return driver.findElement(By.id("usernameOrEmail"));}
    public WebElement getContinueButton() { return driver.findElement(new By.ByCssSelector(".form-button.is-primary"));}

    public WebElement getPassword() { return driver.findElement(By.name("password"));}

    public WebElement getLogin () { return driver.findElement(By.cssSelector(".form-button.is-primary"));}

    //-------------------------------

    public void clickonLoginButton(){
        getLoginButton().click();
    }
    public void insertusername(String username) {
        getUsername().clear();
        getUsername().sendKeys(username);
    }
    public void insertPassword(String password) {
        getPassword().clear();
        getPassword().sendKeys(password);
    }
    public void clickonContinueButton(){
        getContinueButton().click();
    }


    public void clickOnLogin()  {
        getLogin().click();
    }


}


