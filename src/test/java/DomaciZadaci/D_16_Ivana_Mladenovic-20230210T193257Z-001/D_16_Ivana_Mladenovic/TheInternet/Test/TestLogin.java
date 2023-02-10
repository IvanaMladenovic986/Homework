package TheInternet.Test;


import TheInternet.Base.LoginBaseTest;
import TheInternet.Page.LoginPage;
import TheInternet.Page.ProfilePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends LoginBaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get(loginURL);
        loginPage = new LoginPage();
        //profilePage = new ProfilePage();
    }

    @Test
    public void userCanLogIn()  {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String validPassword = excelReader.getStringData("Login", 1,1);
        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickOnLoginButton();
        String actualUrl = "https://the-internet.herokuapp.com/secure";
        Assert.assertEquals(actualUrl, driver.getCurrentUrl());
        //Assert.assertTrue(profilePage.logutButton.isDisplayed());
    }

    @Test
    public void userCannotLogInWithInvalidUsername() {
        String invalidUsername = excelReader.getStringData("Login", 1, 2);
        String validPassword = excelReader.getStringData("Login", 1,1);
        loginPage.insertUsername(invalidUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickOnLoginButton();
        String actualURL = "https://the-internet.herokuapp.com/login";
        Assert.assertEquals(actualURL, driver.getCurrentUrl());
        boolean logOut = false;
        try {
            logOut = driver.findElement(By.linkText("Log out")).isDisplayed();
        } catch (Exception e) {

        }
        Assert.assertFalse(logOut);
    }
    @Test
    public void userCannotLogInWithInvalidPassword() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        String invalidPassword = excelReader.getStringData("Login", 3,2);
        loginPage.insertUsername(validUsername);
        loginPage.insertPassword(invalidPassword);
        loginPage.clickOnLoginButton();
        String actualURL = "https://the-internet.herokuapp.com/login";
        Assert.assertEquals(actualURL, driver.getCurrentUrl());
        boolean logOut = false;
        try {
            logOut = driver.findElement(By.linkText("Log out")).isDisplayed();
        } catch (Exception e) {

        }
        Assert.assertFalse(logOut);
    }
    @Test
    public void userCannotLogInWithInvalidUsernameandPassword() {
        String invalidUsername = excelReader.getStringData("Login", 3, 2);
        String invalidPassword = excelReader.getStringData("Login", 2,3);
        loginPage.insertUsername(invalidUsername);
        loginPage.insertPassword(invalidPassword);
        loginPage.clickOnLoginButton();
        String actualURL = "https://the-internet.herokuapp.com/login";
        Assert.assertEquals(actualURL, driver.getCurrentUrl());
        boolean logOut = false;
        try {
            logOut = driver.findElement(By.linkText("Log out")).isDisplayed();
        } catch (Exception e) {

        }
        Assert.assertFalse(logOut);
    }
    @Test
    public void userCannotLogInWithValidUsernameandEmptyPassword() {
        String validUsername = excelReader.getStringData("Login", 1, 0);
        loginPage.insertUsername(validUsername);
        String invalidPassword = "";
        loginPage.insertPassword(invalidPassword);
        loginPage.clickOnLoginButton();
        String actualURL = "https://the-internet.herokuapp.com/login";
        Assert.assertEquals(actualURL, driver.getCurrentUrl());
        boolean logOut = false;
        try {
            logOut = driver.findElement(By.linkText("Log out")).isDisplayed();
        } catch (Exception e) {

        }
        Assert.assertFalse(logOut);
    }
    @Test
    public void userCannotLogInWithEmptyUsernameandValidPassword() {
        String invalidUsername = "";
        String validPassword = excelReader.getStringData("Login", 1, 1);
        loginPage.insertUsername(invalidUsername);
        loginPage.insertPassword(validPassword);
        loginPage.clickOnLoginButton();
        String actualURL = "https://the-internet.herokuapp.com/login";
        Assert.assertEquals(actualURL, driver.getCurrentUrl());
        boolean logOut = false;
        try {
            logOut = driver.findElement(By.linkText("Log out")).isDisplayed();
        } catch (Exception e) {

        }
        Assert.assertFalse(logOut);
    }
}