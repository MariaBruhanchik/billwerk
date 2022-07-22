package test;

import billwerk.driver.DriverSingleton;
import billwerk.page.MainPage;
import billwerk.util.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners({TestListener.class})
public class SingleTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }


    @Test
    public void hasTheNumberOfCountriesCorrect() {
        MainPage mainPage = new MainPage(driver)
                .open("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        Assert.assertEquals(mainPage.verifyNumberOfElements(), 249);
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();
    }
}
