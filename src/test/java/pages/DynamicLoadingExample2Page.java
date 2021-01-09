package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample2Page extends BasePage {


    @FindBy(xpath = "//div[@id='start']/button")
    private WebElement startButton;


    private By loadtext= By.xpath("//div[@id='finish']/h4");


    public DynamicLoadingExample2Page(WebDriver driver) {
        super(driver);
    }

    public void clickStartButton(){
        startButton.click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadtext));
    }

    public boolean isStartButtonDisplayed(){
        return startButton.isDisplayed();
    }

    public String resultOfLoad(){
        return driver.findElement(loadtext).getText();
    }
}
