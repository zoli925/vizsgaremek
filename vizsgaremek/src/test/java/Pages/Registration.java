package Pages;

import General.Constant;
import General.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
    //properties
    private WebDriver driver;

    public Registration(WebDriver driver) {
        this.driver = driver;
    }
    public void Registration(String usename, String password, String email) {
        driver.findElement(By.id(Constant.REGISTRATION_NAME));
        driver.findElement(By.id(Constant.REGISTRATION_PASSWORD));
        driver.findElement(By.id(Constant.REGISTRATION_PASSWORD2));
        driver.findElement(By.id(Constant.REGISTRATION_EMAIL));
        driver.findElement(By.id(String.valueOf(Constant.REGISTRATION_CREAT_BUTTON)));
    }

}
