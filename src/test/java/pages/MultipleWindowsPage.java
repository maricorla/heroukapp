package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultipleWindowsPage extends BasePage {

    @FindBy(linkText = "Click Here")
    private WebElement buttonClickHere;


    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    public void clickHere(){
        buttonClickHere.click();
    }
}
