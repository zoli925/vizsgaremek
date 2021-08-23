import General.Constant;
import Pages.HomePage;
import Pages.Registration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WikipediaTest {
    private static WebDriver driver;
    private final String URL = "https://en.wikipedia.org/";

    @BeforeAll
    static void setDriverProperty() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32");
    }

    @BeforeEach
    void setDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/Downloads/chromedriver_win32/chromedriver.exe");
        //options.addArguments("--disable-notifications");
        options.addArguments("start-maximized"); // teljes képernyőőben való használat
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new ChromeDriver(options); // új böngésző nyitása az opciókkal
        driver.get(URL);
    }

   @Test
    public void WebTest() {
        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://en.wikipedia.org/wiki/Main_Page", url);
    }





    @Test
    public void registrationWikipedia(){
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");

    }

    @Test
    public void searchSelenium(){
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.id("searchInput")).sendKeys("Selenium (software)");
        driver.findElement(By.id("searchButton")).click();
        Assertions.assertEquals("https://en.wikipedia.org/wiki/Selenium_(software)", driver.getCurrentUrl());
        driver.findElement(By.id("p-logo")).click();
    }

    @Test
    public void searchFramework(){
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.id("searchInput")).sendKeys("Framework");
        driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/ul[1]/li[1]/a")));

        driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/ul[1]/li[1]/a")).click();

        Assertions.assertEquals("https://en.wikipedia.org/wiki/Ajax_(programming)", driver.getCurrentUrl());
    }

    @Test
    public void TestRegistrationWithValidData() {
        HomePage homePage = new HomePage(driver);
        homePage.clickRegLink();
        Registration registration = new Registration(driver);
        registration.Registration(Constant.REGISTRAION_USERNAME_VALUE, Constant.REGISTRATION_PASSWORD_VALUE, Constant.REGISTRATION_EMAIL_VALUE);
        String expected = Constant.REGISTRATION_LINK;
        String actual = driver.getCurrentUrl();
        Assertions.assertEquals("https://en.wikipedia.org/w/index.php?title=Main_Page&gettingStartedReturn=true",driver.getCurrentUrl());
    }

    @AfterEach
    void quitDriver(){
        driver.quit();
    }

}
