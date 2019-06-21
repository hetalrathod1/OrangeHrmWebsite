package OrangeHrm;
import org.testng.Assert;
//import org.junit.Assert;
import org.openqa.selenium.By;

public class Utils extends BasePage {
    // actual result - getting text from web
    public static void assertTextMessage(String expected, By by) {
        String actual = getTextFromElement(by);
        Assert.assertEquals(expected, actual);
    }

    // method for getting text from web(so getting text from assertTextMessage method)
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    // if url contain specific word
    public static void assertURLtext(String text) {

        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    // current url
    public static void assertCurrentURL(String text) {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, text);

    }

    // clicking elements
    public static void clickElements(By by) {
        driver.findElement(by).click();

    }
    // entering elements

    public static void enterElements(By by, String text) {
        driver.findElement(by).sendKeys(text);


    }
}
