package Pages;

import TestEnvironment.TestEnvironment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class DataSave extends TestEnvironment {
    private WebDriver driver;
    private File file;

    public DataSave(WebDriver driver) {
        this.driver = driver;
    }

    public int allLinks() {
        wait = new WebDriverWait(driver, 10);
        driver.findElement(By.id("searchInput")).sendKeys("CIA");
        driver.findElement(By.id("searchButton")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElements(By.tagName("a")).size();
    }
    public Boolean saveToFile(){
        try {
            FileWriter fileWriter = new FileWriter(file = new File("src/test/java/numberOfLinks.txt"));
            fileWriter.write("Az oldalon található linkek száma: "+String.valueOf(allLinks()));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
