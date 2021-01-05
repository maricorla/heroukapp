package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    private final String BASE_URL="https://the-internet.herokuapp.com/";
    protected HomePage homepage;




    @BeforeSuite
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");
        driver = new ChromeDriver(options);
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        goHome();
        homepage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get(BASE_URL);
    }

    @AfterSuite
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }


}
