package DomaciZadaci.Wordpress.Base;

import DemoQA.DemoQAPages.ProfilePage;
import DomaciZadaci.Wordpress.Pages.LoginPage;
import Practice.PracticePages.PracticeLoginPage;
import Practice.PracticePages.PracticePracticePage;
import Practice.PracticePages.PracticeProfilePage;
import Practice.PracticePages.PracticeSidebarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class WordpressBase {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public LoginPage loginPage;
    public ProfilePage profilePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage = new LoginPage(driver, wdwait);
        profilePage = new ProfilePage(driver, wdwait);
    }

    @AfterClass
    public void tearDown() {

    }
}
