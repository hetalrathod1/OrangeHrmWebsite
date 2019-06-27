package OrangeHrm;

import org.openqa.selenium.By;

public class LoginPage extends Utils{

    private By _hoverPIM=By.xpath("//b[contains(text(),'PIM')]");
    private By _clickAddEmployee=By.xpath("//a[@id='menu_pim_addEmployee']");

    public void verifyUserIsOnLoginPage() {

        assertCurrentURL("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

    }



    public void hoverAndClickCatogaryPIM()
    {
        hoverElement(_hoverPIM);
        clickElements(_clickAddEmployee);
    }

}
