package TestEnvironment;

import General.Constant;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestEnvironment {
    protected WebDriver driver;
    protected HomePage homePage;
    protected WebDriverWait wait;

    @BeforeEach
    void setDriver() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // teljes képernyőőben való használat
        options.addArguments("--incognito");
        //options.addArguments("--headless");  //a gitHub használatához tedd vissza
        driver = new ChromeDriver(options); // új böngésző nyitása az opciókkal

        driver.navigate().to(Constant.MAIN_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterEach
    void quitDriver() {
        driver.quit();
    }
}
