import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class TableTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
    }

    @Test
    public void validateTableData() {
        List<WebElement> rows = driver.findElements(By.cssSelector("#table1 tbody tr"));

        // Example: check that first row has "Smith" in last name column
        String lastName = rows.get(0).findElement(By.xpath("td[1]")).getText();
        Assert.assertEquals(lastName, "Smith");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
