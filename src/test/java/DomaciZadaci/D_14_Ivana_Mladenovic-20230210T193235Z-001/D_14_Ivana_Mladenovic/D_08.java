package DomaciZadaci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class D_08 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");

        Cookie cookie1 =  new Cookie("userID", "3b3ede21-8dc7-4a9a-9335-268f0df37136");
        Cookie cookie2 = new Cookie("expires", "2023-01-22T17%3A41%3A50.008Z");
        Cookie cookie3 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6Iml2YW5hIiwicGFzc3dvcmQiOiJUYXJhbnRpbm8xISIsImlhdCI6MTY3MzgwNDUxMH0.pTopXEBCCgVKUFpxuG3gTBlQ-UE3G0ccJg-Joc5OT4Q");

        driver.manage().addCookie(cookie1);
        driver.manage().addCookie(cookie2);
        driver.manage().addCookie(cookie3);
        driver.navigate().refresh();

        WebElement profile = driver.findElement(By.linkText("profile"));
        profile.click();

        WebElement goToStoreButton = driver.findElement(By.id("gotoStore"));
        goToStoreButton.click();

        WebElement addBook1 = driver.findElement(By.id("see-book-Git Pocket Guide"));
        addBook1.click();

        Thread.sleep(2000);
        WebElement collection = driver.findElement(By.id("addNewRecordButton"));
        collection.click();
        driver.navigate().refresh();

        Thread.sleep(2000);
        WebElement goBackToStore = driver.findElement(By.id("addNewRecordButton"));
        goBackToStore.click();

        Thread.sleep(4000);
        WebElement addBook2 = driver.findElement(By.id("see-book-Learning JavaScript Design Patterns"));
        addBook2.click();
        collection.click();
        driver.navigate().refresh();

        Thread.sleep(4000);
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        Thread.sleep(2000);
        WebElement login = driver.findElement(By.linkText("login"));
        login.click();

        Thread.sleep(2000);
        WebElement username = driver.findElement(By.id("userName"));
        String username1 = "ivana";
        username.sendKeys(username1);

        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        String password1 = "Tarantino1!";
        password.sendKeys(password1);

        WebElement buttonLogin = driver.findElement(By.id("login"));
        buttonLogin.click();

        String book1 = "Git Pocket Guide";
        Assert.assertEquals(book1, addBook1);

        String book2 = "Learning JavaScript Design Patterns";
        Assert.assertEquals(book2, addBook2);

    }
}
