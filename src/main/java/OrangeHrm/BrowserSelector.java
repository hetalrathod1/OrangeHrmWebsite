package OrangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {
LoadProp loadProp= new LoadProp();

public void setUpBrowser()
{
    String browser= loadProp.getPropety("browser");
    if (browser.equalsIgnoreCase("chrome"))
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
          driver= new ChromeDriver();
        driver.manage().window().fullscreen();
    }
    else if (browser.equalsIgnoreCase("firefox"))
    {
        System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
          driver= new FirefoxDriver();
        driver.manage().window().fullscreen();
    }
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();

}
}
