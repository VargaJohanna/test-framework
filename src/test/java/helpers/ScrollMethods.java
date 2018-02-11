package helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollMethods {
    private static ScrollMethods instance;

    private ScrollMethods() {}

    public static ScrollMethods getInstance() {
        if(instance == null) {
            instance = new ScrollMethods();
        }
        return instance;
    }
    public void scrollIntoView(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
