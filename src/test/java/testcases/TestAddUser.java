package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddUser;
import pages.LoginPage;
import utilities.DriverSetUp;

public class TestAddUser extends DriverSetUp {
    LoginPage loginPage = new LoginPage();
    AddUser addUser = new AddUser();

    @Test
    public void testAddUser(){
//        getDriver().get(loginPage.baseUrl);
//        loginPage.userLogin();
        addUser.clickOnElement(addUser.userManagement);
        addUser.clickOnElement(addUser.user);
        addUser.clickOnElement(addUser.addNewButton);
        addUser.writeOnElement(addUser.PersonalID,"01923456");
        addUser.writeOnElement(addUser.fullName,"Abdul Karim");
        addUser.selectWithVisibleText(addUser.departmentName,"Admin");
        addUser.writeOnElement(addUser.designation,"QA");
        addUser.selectWithVisibleText(addUser.country,"Bangladesh");
        addUser.writeOnElement(addUser.phoneNumber,"097884374");
        addUser.writeOnElement(addUser.emailAddress,"test@gmail.com");
        addUser.scrollToElement(addUser.saveButton);
        addUser.clickOnElement(addUser.saveButton);
        addUser.addScreenShort("After successfully create a user");

        Assert.assertEquals(getDriver().getCurrentUrl(),addUser.userAddUrl);
        Assert.assertTrue(addUser.isElementVisible(addUser.addNewButton));
    }
}
