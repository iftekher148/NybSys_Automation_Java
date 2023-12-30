package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RemoveUser;
import utilities.DriverSetUp;

public class TestRemoveUser extends DriverSetUp {
    LoginPage loginPage = new LoginPage();
    RemoveUser removeUser = new RemoveUser();

    @Test
    public void testRemoveUserFunction(){
        getDriver().get(loginPage.baseUrl);
        loginPage.userLogin();
        removeUser.clickOnElement(removeUser.userManagement);
        removeUser.clickOnElement(removeUser.user);
        removeUser.clickOnElement(removeUser.threeDot);
        removeUser.clickOnElement(removeUser.removeButton);
        removeUser.clickOnElement(removeUser.removeConfirm);
        removeUser.addScreenShort("Successfully remove a user");
        Assert.assertFalse(removeUser.isElementVisible(removeUser.removeConfirm));
    }
}
