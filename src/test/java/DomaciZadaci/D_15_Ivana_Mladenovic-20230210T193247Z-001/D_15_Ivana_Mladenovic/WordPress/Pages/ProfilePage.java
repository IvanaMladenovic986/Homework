package DomaciZadaci.Wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    WebElement logOutButton;
    WebElement title;

    public ProfilePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public static WebElement getLogOutButton() {
        return driver.findElement(By.cssSelector(".button.sidebar__me-signout-button.is-compact"));}

    public WebElement getTitle() {
        return driver.findElement(By.className("site__title"));
    }

    //-------------------------

    public void clickOnLogOutButton() {
        getLogOutButton().click();
    }

}
