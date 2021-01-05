package pages;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends BasePage {

   @FindBy(xpath = "//input[@type='range']")
   private WebElement slider;

    @FindBy(id = "range")
    private WebElement numRange;


    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    public void moveSliderRight( int numOfStep){
        for(int i=0; i<numOfStep;i++){
        slider.sendKeys(Keys.ARROW_RIGHT);}
    }

    public String getResultValueRange(){
        return numRange.getText();
    }

    public String getStep(){
        return slider.getAttribute("step");
    }


}
