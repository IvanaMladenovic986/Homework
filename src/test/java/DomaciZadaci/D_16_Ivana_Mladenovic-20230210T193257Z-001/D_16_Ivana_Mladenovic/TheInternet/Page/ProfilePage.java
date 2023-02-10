package TheInternet.Page;

import TheInternet.Base.LoginBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProfilePage extends LoginBaseTest {

    public ProfilePage(){PageFactory.initElements(driver, this);}


    public @FindBy (className = "icon-2x icon-signout")
    WebElement logutButton;

    public void clickonLogoutButton(){
        logutButton.click();
    }

}
