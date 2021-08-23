package Tests;

import Pages.DataSave;
import TestEnvironment.TestEnvironment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.net.ssl.SSLServerSocket;
import java.sql.SQLOutput;

public class TestDataSave extends TestEnvironment {

    DataSave dataSave;

    @Test
    public void testAllLinks() {
        dataSave = new DataSave(driver);
        System.out.println(dataSave.allLinks());
        Assertions.assertEquals(3447, dataSave.allLinks());
    }

    @Test
    void TestsaveToFile(){
        dataSave = new DataSave(driver);
        Assertions.assertTrue(dataSave.saveToFile());
    }
}
