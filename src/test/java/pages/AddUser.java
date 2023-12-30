package pages;

import org.openqa.selenium.By;

public class AddUser extends BasePage{

    public String userAddUrl = "http://13.58.91.85/#/user-e/add";
    public By userManagement = By.xpath("//span[normalize-space()='User Management']");
    public By user = By.xpath("//a[normalize-space()='User']");
    public By addNewButton = By.xpath("//button[normalize-space()='Add New']");
    public By PersonalID = By.xpath("//input[@id='phoneNo']");
    public By fullName =By.xpath("//input[@id='fullName']");
    public By departmentName = By.xpath("//select[@name='departmentID']");
    public By designation = By.xpath("//input[@name='designation']");
    public By country = By.xpath("//select[@name='country']");
    public By phoneNumber = By.xpath("//input[@name='phoneNumber']");
    public By emailAddress = By.xpath("//input[@name='email']");
    public By saveButton = By.xpath("//button[@id='btnSave']");

}
