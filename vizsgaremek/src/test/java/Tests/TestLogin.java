package Tests;

import Pages.Login;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestLogin  extends TestEnvironment {

    @Test
    public void loginWikipedia() {
        Login login = new Login(driver);
        login.Login("VaskoZoli", "VaskoZoli1234");
        Assertions.assertEquals("VaskoZoli", driver.findElement((By.xpath("//*[@id=\"pt-userpage\"]/a"))).getText());
    }
}

