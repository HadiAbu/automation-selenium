import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver(); // Make sure Chrome is installed
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleTitle() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
