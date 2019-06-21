package OrangeHrm;

//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSuit extends Utils {

    HomePage homePage = new HomePage();
    BaseTest baseTest=new BaseTest();

    SoftAssert softAssert=new SoftAssert();
    @Test
    public void openBrowser()
    {
        baseTest.openBrowser();
    }


    @Test
    public void userLoginSuccessfully()
    {
        baseTest.openBrowser();
        homePage.loginToOrangeHrm();
    }
}
