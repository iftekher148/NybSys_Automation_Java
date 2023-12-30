package testcases;

import org.testng.annotations.Test;
import pages.LogOut;
import pages.LoginPage;
import utilities.DriverSetUp;

public class TestLogOut extends DriverSetUp {
    LoginPage loginPage = new LoginPage();
    LogOut logOut = new LogOut();
    @Test
    public void testLogout(){
        getDriver().get(loginPage.baseUrl);
        loginPage.userLogin();
        logOut.clickOnElement(logOut.logOutCursor);
        logOut.clickOnElement(logOut.logoutButton);

    }
}
