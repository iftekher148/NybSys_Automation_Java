package pages;

import org.openqa.selenium.By;

public class LogOut extends BasePage{
    public By logOutCursor = By.xpath("//span[@class='fa ml-1 text-white cursor-pointer fa-chevron-down']");
    public By logoutButton = By.xpath("//a[normalize-space()='Logout']");
}
