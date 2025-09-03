import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }

    @Test
    public void checkCheckboxes() {
        WebElement checkbox1 = driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[2]"));

        if (!checkbox1.isSelected()) checkbox1.click();
        if (checkbox2.isSelected()) checkbox2.click();

        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertFalse(checkbox2.isSelected());
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
