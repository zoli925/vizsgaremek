package Tests;

import General.Constant;
import Pages.HomePage;
import Pages.Registration;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestRegistration extends TestEnvironment {

    @Disabled
    @Test
    public void TestRegistrationWithValidData() {
        HomePage homePage = new HomePage(driver);
        homePage.clickRegLink();
        Registration registration = new Registration(driver);
        registration.Registration(Constant.REGISTRAION_USERNAME_VALUE, Constant.REGISTRATION_PASSWORD_VALUE, Constant.REGISTRATION_EMAIL_VALUE);
        String expected = Constant.REGISTRATION_LINK;
        String actual = driver.getCurrentUrl();
        Assertions.assertEquals("https://en.wikipedia.org/w/index.php?title=Main_Page&gettingStartedReturn=true",driver.getCurrentUrl());
    }

}
