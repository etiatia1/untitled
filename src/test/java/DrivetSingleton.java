import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class DrivetSingleton {
    private static WebDriver driver;

    public static WebDriver getDriverInstance(){
        if (driver==null){
            System.setProperty("webdriver.chrome.driver",Constants.CHROMEDRIVER_PATH);
            driver=new ChromeDriver();
        }
        return driver;
    }
}
