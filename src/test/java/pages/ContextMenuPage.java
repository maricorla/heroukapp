package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage {

    @FindBy(id = "hot-spot")
    private WebElement box;


    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void rightClickInTheBox(){
       Actions action = new Actions(driver);
       action.contextClick(box).perform();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

}
