import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BacePage {
    public void clickElement(By locator){
        getWebElement(locator).click();
    }
    public void sendKeyToElement(By locator,String text){
        getWebElement(locator).sendKeys(text);
    }
    private WebElement getWebElement(By locator){
        return DrivetSingleton.getDriverInstance().findElement(locator);
    }
}
