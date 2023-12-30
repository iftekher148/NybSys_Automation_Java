package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.DriverSetUp;

public class TestLoginPage extends DriverSetUp {
    LoginPage loginPage = new LoginPage();
    @Test
    public void testLoginPage(){
        getDriver().get(loginPage.baseUrl);
        loginPage.userLogin();

        Assert.assertEquals(getDriver().getCurrentUrl(),loginPage.baseUrl);
        Assert.assertEquals(getDriver().getTitle(),loginPage.loginPageTitle);
    }
}
