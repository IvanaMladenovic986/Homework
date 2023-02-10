package DomaciZadaci.Wordpress.Pages;

import DomaciZadaci.Wordpress.Base.WordpressBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends WordpressBase {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    WebElement logOutButton;
    WebElement icon;

    public ProfilePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public static WebElement getLogOutButton() {
        return driver.findElement(By.cssSelector(".button.sidebar__me-signout-button.is-compact"));}


    public WebElement getIcon () { return driver.findElement(By.cssSelector(".gravatar.masterbar__item-me-gravatar"));}
    public WebElement getprofileName  () { return driver.findElement(By.className("site__title"));}


    //-------------------------
    public void clickOnLIcon() {
        getIcon().click();
    }
    public void clickOnLogOutButton() {
        getLogOutButton().click();
    }

}
