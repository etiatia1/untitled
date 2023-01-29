import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class TestLogin {
    public static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://buyme.co.il");
    }

    @Test   //move to sigh window
    public void rightOFTest() {
        driver.findElement(By.className("notSigned")).click();

    }
    @Test   //     התחברות
     public void test2(){
          driver.findElement(By.id("ember1835")).sendKeys("Etiatia1@gmail.com");
     }
     @Test
     public void test3(){
          driver.findElement(By.id("ember1842")).sendKeys("Noel135o");
     }
     @Test  // לחיצה על כפתור התחברות
     public void test4(){
          driver.findElement(By.id("ember1851")).click();
     }
}