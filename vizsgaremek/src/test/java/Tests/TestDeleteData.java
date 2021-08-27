package Tests;

import Pages.DeleteData;
import Pages.Login;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestDeleteData extends TestEnvironment {

    private DeleteData deleteData;
    private Login login;

    @DisplayName("Tesztelem az adattörlést")
    @Test
    public void testDeleteData() {
        login = new Login(driver);
        login.Login("VaskoZoli", "VaskoZoli1234");

        deleteData = new DeleteData(driver);

    }
}
