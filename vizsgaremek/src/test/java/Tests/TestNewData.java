package Tests;

import General.Constant;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestNewData extends TestEnvironment {

    @Test
    private void newdata() {
        String text = "Vizsgaremek";
        driver.navigate().to("https://en.wikipedia.org/wiki/User:VaskoZoli");
        driver.findElement(By.id("pt-userpage")).click();
        driver.findElement(By.xpath("ca-talk")).click();
        driver.findElement(By.id("wpTextbox1")).sendKeys(text);
        driver.findElement(By.id("wpPreview")).click();
        Assertions.assertTrue(driver.getPageSource().contains("Vizsgaremek"));

    }

}
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'UserLogout')]"))).click();