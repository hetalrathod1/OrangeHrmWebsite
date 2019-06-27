package OrangeHrm;

import org.openqa.selenium.By;

public class AddEmployeePage extends Utils {

    LoadProp loadProp=new LoadProp();
    private By _employeeFullName=By.xpath("//input[@id='firstName']");
    private By _employeeLastName=By.xpath("//input[@id='lastName']");
    private By _employeeId=By.xpath("//input[@id='employeeId']");
    private By _empPhotoFile=By.xpath("//input[@id='photofile']");
    private By _clickOnSaveButton=By.xpath("//input[@id='btnSave']");

    public void verifyUserIsOnAddEmployeePage()
    {
        assertCurrentURL("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
    }
    public void addEmployeeDetail()
    {

        enterElements(_employeeFullName,loadProp.getPropety("firstname"));
        enterElements(_employeeLastName,loadProp.getPropety("lastname"));
        enterElements(_employeeId,loadProp.getPropety("empid"));
        enterElements(_empPhotoFile,"C:\\Users\\Pahal\\Desktop"); // upload file .just add file path name
        clickElements(_clickOnSaveButton);
    }
}
