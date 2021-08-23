package Pages;

import General.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewData {
    private WebDriver driver;
    private WebDriverWait wait;

    public NewData(WebDriver driver) {
        this.driver = driver;
    }

    public void NewData() {
        wait = new WebDriverWait(driver, 10);
        driver.findElement(Constant.USER_NAME).click();
        driver.findElement(Constant.TALK_BUTTON).click();
        driver.findElement(By.id(Constant.NEW_DATA)).sendKeys();
        driver.findElement(Constant.SHOW_PREVIEW_BUTTON).click();

    }
}
