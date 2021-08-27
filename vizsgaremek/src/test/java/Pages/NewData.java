package Pages;

import General.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewData {
    private WebDriver driver;
    private WebDriverWait wait;
    private Login login;

    public NewData(WebDriver driver) {
        this.driver = driver;
    }

    /*public void LoginND(String username, String password) {
        driver.findElement(Constant.LOGIN_NAME).sendKeys(Constant.LOGIN_NAME_VALUE);
        driver.findElement(Constant.LOGIN_PASSWORD).sendKeys(Constant.LOGIN_PASSWORD_VALUE);
        driver.findElement(Constant.LOGIN_BUTTON).click();

    }*/

    public void NewData() {

        driver.findElement(Constant.TALK_BUTTON).click();
        driver.findElement(By.id(String.valueOf(Constant.INPUT_FIELD))).sendKeys(Constant.NEW_DATA);
        driver.findElement(Constant.SHOW_PREVIEW_BUTTON).click();

    }
}
