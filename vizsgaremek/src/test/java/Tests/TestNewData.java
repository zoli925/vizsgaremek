package Tests;

import General.Constant;
import Pages.Login;
import Pages.NewData;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestNewData extends TestEnvironment {

    //properties
    private NewData newData;
    private Login login;


    @DisplayName("Tesztelem az adatbevitelt")
    @Test
    public void testNewData() {
        login = new Login(driver);
        login.Login("VaskoZoli","VaskoZoli1234");

        newData = new NewData(driver);
        newData.NewData();

        Assertions.assertTrue(driver.getPageSource().contains("Vizsgaremek"));
    }
}


