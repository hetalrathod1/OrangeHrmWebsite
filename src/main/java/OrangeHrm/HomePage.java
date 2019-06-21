package OrangeHrm;

//import org.junit.Assert;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HomePage extends Utils {

//    SoftAssert softAssert=new SoftAssert();

    LoadProp loadProp=new LoadProp();
    private By _userName= By.xpath("//input[@id='txtUsername']");
    private By _password = By.xpath("//input[@id='txtPassword'] ");
    private By _loginButton = By.xpath("//input[@class='button']");




    public void loginToOrangeHrm()
    {
        enterElements(_userName,loadProp.getPropety("username"));
        enterElements(_password,loadProp.getPropety("password"));
        clickElements(_loginButton);

    }
}
