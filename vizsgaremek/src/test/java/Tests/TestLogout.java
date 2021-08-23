package Tests;

import Pages.Login;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogout extends TestEnvironment {
    @Test
    public void logoutWikipedia(){
        wait = new WebDriverWait(driver, 10);
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
        String username = "VaskoZoli";
        String password = "VaskoZoli1234";
        driver.findElement(By.id("pt-login")).click();
        driver.findElement(By.id("wpName1")).sendKeys(username);
        driver.findElement(By.id("wpPassword1")).sendKeys(password);
        driver.findElement(By.id("wpLoginAttempt")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'UserLogout')]"))).click();
        Assertions.assertEquals("https://en.wikipedia.org/wiki/Main_Page", driver.getCurrentUrl());
    }
}
