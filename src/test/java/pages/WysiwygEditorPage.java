package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WysiwygEditorPage extends BasePage {

    @FindBy(id = "mce_0_ifr")
    private WebElement iframeId;


    public WysiwygEditorPage(WebDriver driver) {
        super(driver);
    }

    private void switchToEditArea(){
        driver.switchTo().frame(iframeId);
    }
}
