package TheInternet.Base;



import TheInternet.Page.LoginPage;
import TheInternet.Page.ProfilePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class LoginBaseTest {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    public Login.LoginBase.ExcelReader excelReader;
    public String loginURL;
    public LoginPage loginPage;
    public ProfilePage profilePage;
    public String logoutUrl;

    //DDT - Data Driven Test
    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new Login.LoginBase.ExcelReader("src/test/java/TheInternet/InternetBase.xlsx");
        loginURL = excelReader.getStringData("URL", 0, 0);

    }
    public void waitForClickability(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForVisibility(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isDisplayed(WebElement element) {
        boolean webelement = false;
        try {
            webelement = element.isDisplayed();
        } catch (Exception e) {

        }
        return webelement;
    }

    @AfterClass
    public void tearDown() {

    }
}