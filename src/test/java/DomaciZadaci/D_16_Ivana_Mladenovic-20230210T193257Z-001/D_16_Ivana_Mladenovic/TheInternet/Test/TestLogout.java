package TheInternet.Test;

import TheInternet.Base.LoginBaseTest;
import TheInternet.Page.LoginPage;
import TheInternet.Page.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogout extends LoginBaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get(loginURL);
        driver.get(logoutUrl);
        loginPage = new LoginPage();
        profilePage = new ProfilePage();
    }

    @Test
    public void userCanLogOut()  {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1,1);
        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickOnLoginButton();
        profilePage.clickonLogoutButton();
        String actualUrl = "https://the-internet.herokuapp.com/login";
        Assert.assertEquals(actualUrl, driver.getCurrentUrl());

    }
}
