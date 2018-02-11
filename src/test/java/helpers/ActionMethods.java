package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods {
    private static ActionMethods instance;

    private ActionMethods() {}

    public static ActionMethods getInstance() {
        if(instance == null) {
            instance = new ActionMethods();
        }
        return instance;
    }

    public void moveToElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
}
