package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.DriverSetUp;

public class LoginPage extends BasePage {
    public String baseUrl ="http://13.58.91.85/#/login";
    public String loginPageTitle = "Login | Sentra Enterprise Admin Panel";
    public By usernameField = By.xpath("//input[@placeholder='user name']");
    public By passwordField = By.xpath("//input[@placeholder='password']");
    public By loginButton = By.xpath("//button[@id='btnLogin']");

    public void userLogin(){
        writeOnElement(usernameField,"admin@nq");
        writeOnElement(passwordField,"admin");
        clickOnElement(loginButton);
    }
}
