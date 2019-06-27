package OrangeHrm;

//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.LoggingAssert;
import org.testng.asserts.SoftAssert;

public class TestSuit extends Utils {

    HomePage homePage = new HomePage();
    BaseTest baseTest=new BaseTest();
    LoginPage loginPage=new LoginPage();
    AddEmployeePage addEmployeePage=new AddEmployeePage();

    //SOFTASSERT
    SoftAssert softAssert=new SoftAssert();
@Test
    public void verifyUserIsOnHomePage()
    {
       // baseTest.openBrowser();
         homePage.userIsOnHomePage();
    }

    @Test
    public void userIsLoginSuccessfully()
    {
        baseTest.openBrowser();
        homePage.userIsOnHomePage();
        homePage.loginToOrangeHrm();
    }

    @Test
    public void userIsAbleToNavigateToAddEmployeePage()
    {
        baseTest.openBrowser();
        homePage.userIsOnHomePage();
        homePage.loginToOrangeHrm();
        loginPage.verifyUserIsOnLoginPage();
        loginPage.hoverAndClickCatogaryPIM();
    }
    @Test
    public void userIsAbleToAddEmployee()
    {
        baseTest.openBrowser();
        homePage.userIsOnHomePage();
        homePage.loginToOrangeHrm();
        loginPage.verifyUserIsOnLoginPage();
        loginPage.hoverAndClickCatogaryPIM();
        addEmployeePage.verifyUserIsOnAddEmployeePage();
        addEmployeePage.addEmployeeDetail();
    }

     }
