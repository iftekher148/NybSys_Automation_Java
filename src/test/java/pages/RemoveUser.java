package pages;

import org.openqa.selenium.By;

public class RemoveUser extends BasePage{
    public By userManagement = By.xpath("//span[normalize-space()='User Management']");
    public By user = By.xpath("//a[normalize-space()='User']");
    public By threeDot = By.xpath("//tbody/tr[7]/td[7]/button[1]/span[1]/span[1]");
    public By removeButton = By.xpath("//span[normalize-space()='Remove']");
    public By removeConfirm = By.xpath("//button[normalize-space()='Yes']");

}
