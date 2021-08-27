package Pages;

import General.Constant;
import General.Methods;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    //properties
    private WebDriver driver;

    //constructor
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    //methods
    public void Login(String username, String password) {

        driver.findElement(By.id("pt-login")).click();
        driver.findElement(By.id("wpName1")).sendKeys(username);
        driver.findElement(By.id("wpPassword1")).sendKeys(password);
        driver.findElement(By.id("wpLoginAttempt")).click();

    }
}
 /*if (Methods.waitingForLoad(Constant.LOGIN_BUTTON, driver)){
            driver.findElement(Constant.LOGIN_NAME).sendKeys(Constant.LOGIN_NAME_VALUE);
            driver.findElement(Constant.LOGIN_PASSWORD).sendKeys(Constant.LOGIN_PASSWORD_VALUE);
            driver.findElement(Constant.LOGIN_BUTTON).click();
        } else {
            System.out.println("Error number 2");
        }*/
