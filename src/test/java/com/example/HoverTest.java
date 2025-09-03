import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HoverTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
    }

    @Test
    public void hoverOverUser() {
        Actions actions = new Actions(driver);
        WebElement user1 = driver.findElement(By.cssSelector(".figure:nth-child(3)"));
        actions.moveToElement(user1).perform();

        String name = user1.findElement(By.tagName("h5")).getText();
        Assert.assertEquals(name, "name: user1");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
