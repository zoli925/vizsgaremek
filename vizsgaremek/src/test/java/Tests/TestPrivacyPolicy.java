package Tests;

import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPrivacyPolicy extends TestEnvironment {
    @Test
    public void privacyPolivcy() {
        driver.navigate().to("https://foundation.wikimedia.org/wiki/Privacy_policy");
        Assertions.assertTrue(driver.getPageSource().contains("Policy"));
    }
}
