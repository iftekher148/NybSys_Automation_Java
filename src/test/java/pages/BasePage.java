package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static utilities.DriverSetUp.getDriver;

public class BasePage {
    public WebElement getElement(By locator){
        //waitForElementToBeVisible(locator);
        return getDriver().findElement(locator);
    }
    public void clickOnElement(By locator){
        try{
            waitForElementToBeClickable(locator);
            getElement(locator).click();
        }catch (Exception e) {
            // waitForElementToBeClickable(locator);
            getElement(locator).click();
        }
    }

    public void writeOnElement(By locator, String inputText){
        getElement(locator).clear();
        getElement(locator).sendKeys(inputText);
    }

    public String getElementText(By locator){
        return getElement(locator).getText();
    }

    public void scrollToElement(By locator){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)"); //last position
    }

    public boolean isElementVisible(By locator){
        try {
            return getElement(locator).isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public void selectWithVisibleText(By selectLocator, String visibleText){
        //getElement(selectLocator);
        waitForElementToBeClickable(selectLocator);
        Select select = new Select(getElement(selectLocator));
        select.selectByVisibleText(visibleText);
    }
    public void waitForElementToBeVisible(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    public void waitForElementToBeClickable(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void addScreenShort(String name){
        Allure.addAttachment(name,new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
    }
}
