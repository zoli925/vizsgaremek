package Pages;

import General.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrivacyPolicy {
    private WebDriver driver;
    private WebDriverWait wait;

    public PrivacyPolicy(WebDriver driver) {
        this.driver = driver;
    }

    public void PivacyPolicy() {
        wait = new WebDriverWait(driver, 10);
        driver.findElement(Constant.POLICY_LINK).click();
    }
}
