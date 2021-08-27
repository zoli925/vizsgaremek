package Pages;

import General.Constant;
import General.Methods;
import org.openqa.selenium.WebDriver;

public class DeleteData {
    private WebDriver driver;

    public DeleteData(WebDriver driver) {
        this.driver = driver;
    }


    private void deleteData() {
        driver.findElement(Constant.LOGIN_NAME).sendKeys(Constant.LOGIN_NAME_VALUE);
        driver.findElement(Constant.LOGIN_PASSWORD).sendKeys(Constant.LOGIN_PASSWORD_VALUE);
        driver.findElement(Constant.LOGIN_BUTTON).click();
        driver.findElement(Constant.SEARCH_INPUT).sendKeys(Constant.SEARCH_VALUE);
        driver.findElement(Constant.ADD_WATCHLIST).click();
        driver.findElement(Constant.WATCHLIST).click();
        driver.findElement(Constant.EDIT_BUTTON).click();
        driver.findElement(Constant.RADIO_BUTTON).click();
        driver.findElement(Constant.REMOVE_BUTTON).click();
    }
}



