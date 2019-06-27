package OrangeHrm;

//import org.junit.Assert;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HomePage extends Utils {

    LoadProp loadProp=new LoadProp();

    private By _username = By.xpath("//input[@id='txtUsername']");
    private By _password = By.xpath("//input[@id='txtPassword']");
    private By _loginbtn = By.xpath("//input[@id='btnLogin']");


    public void userIsOnHomePage()
    {

        assertCurrentURL("https://opensource-demo.orangehrmlive.com/");
        System.out.println("user is on homepage");
    }


    public void loginToOrangeHrm()
    {
        enterElements(_username,loadProp.getPropety("username"));
        enterElements(_password,loadProp.getPropety("password"));
        clickElements(_loginbtn);

    }




}
