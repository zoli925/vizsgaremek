package Pages;

import General.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
    private WebDriver driver;
    private WebDriver wait;

   //constructor
    public Logout(WebDriver driver) {
        this.driver = driver;
    }
    public void PivacyPolicy(){
        wait = (WebDriver) new WebDriverWait(driver, 10);
        driver.findElement(Constant.LOGOUT_LINK).click();
    }
}
