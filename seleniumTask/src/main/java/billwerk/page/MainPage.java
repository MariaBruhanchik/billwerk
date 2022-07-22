package billwerk.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends AbstractPage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage open(String url) {
        driver.get(url);
        return this;
    }

    public int verifyNumberOfElements() {
        List<WebElement> elements = driver.findElements(By.tagName("option"));
        return elements.size();
    }
}
