package Tests;

import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestLogin  extends TestEnvironment {

    @Test
    public void loginWikipedia() {
        String username = "VaskoZoli";
        String password = "VaskoZoli1234";
        driver.findElement(By.id("pt-login")).click();
        driver.findElement(By.id("wpName1")).sendKeys(username);
        driver.findElement(By.id("wpPassword1")).sendKeys(password);
        driver.findElement(By.id("wpLoginAttempt")).click();
        Assertions.assertEquals(username, driver.findElement((By.xpath("//*[@id=\"pt-userpage\"]/a"))).getText());
    }
}

