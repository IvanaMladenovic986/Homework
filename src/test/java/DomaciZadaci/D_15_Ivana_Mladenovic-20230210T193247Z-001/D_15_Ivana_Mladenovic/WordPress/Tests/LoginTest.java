package DomaciZadaci.Wordpress.Tests;

import DomaciZadaci.Wordpress.Base.WordpressBase;
import DomaciZadaci.Wordpress.Pages.ProfilePage;
import Practice.PracticeBase.PracticeBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.profiler.model.Profile;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends WordpressBase {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get("https://wordpress.com/?apppromo");
    }

    @Test
    public void userCanLogIn()  {
        loginPage.clickonLoginButton();
        loginPage.insertusername("ivanamladenovic986");
        loginPage.clickonContinueButton();
        loginPage.insertPassword("miawallace1");;
        loginPage.clickOnLogin();
        Assert.assertTrue(ProfilePage.getLogOutButton().isDisplayed());

    }
}

