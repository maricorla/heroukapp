package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyPage extends BasePage {

    @FindBy(id = "target")
    private WebElement inputField;

    @FindBy(id = "result")
    private WebElement result;



    public KeyPage(WebDriver driver) {
        super(driver);
    }

    public void insertKeys(String text){
        inputField.sendKeys(text);
    }

    public String getResult(){
        return result.getText();

    }





}
