import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class TestCase {
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
     @Test   //move to new user create
     public void test1(){
          driver.findElement(By.xpath("//span[@class=\"text-link theme\"]")).click();
     }
     @Test
    public void test2(){
        driver.findElement(By.id("ember1862")).sendKeys("newuser");
     }
    @Test
    public void test3(){
        driver.findElement(By.id("ember1869")).sendKeys("email@new");
    }
    @Test
    public void test4(){
        driver.findElement(By.id("valPass")).sendKeys("NewPass1");
    }

    @Test
    public void test5(){
        driver.findElement(By.id("ember1883")).sendKeys("NewPass1");
    }

    @Test
    public void test6(){
        driver.findElement(By.id("ember1889")).click();
    }

    @Test
    public void test7(){
        driver.findElement(By.id("ember1893")).click();
    }


//     @Test   //     התחברות
//     public void test2(){
//          driver.findElement(By.id("ember1835")).sendKeys("Etiatia1@gmail.com");
//     }
//     @Test
//     public void test3(){
//          driver.findElement(By.id("ember1842")).sendKeys("Noel135o");
//     }
//     @Test  // לחיצה על כפתור התחברות
//     public void test4(){
//          driver.findElement(By.id("ember1851")).click();
//     }
}