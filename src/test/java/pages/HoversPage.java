package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.List;

public class HoversPage extends BasePage {

    @FindBy(xpath = "//div[@class='figure']")
    private List<WebElement> figuresBox;

    @FindBy(className = "figcaption")
    private By boxCaption;



    public HoversPage(WebDriver driver) {
        super(driver);
    }

    public FigureCaption hoverOverFigure(int index){
        WebElement figure = figuresBox.get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement(By.className("figcaption")));
    }


    public class FigureCaption{

        private WebElement caption;

        @FindBy(tagName = "h5")
        private By header;

        @FindBy(tagName = "a")
        private By link;

        public FigureCaption(WebElement caption){
            this.caption= caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
    }

    public String getTitle(){
            return caption.findElement(By.tagName("h5")).getText();
    }

    public String getLink(){
            return caption.findElement(By.tagName("a")).getAttribute("href");
    }

    public String getTextLink(){
            return caption.findElement(By.tagName("a")).getText();
    }


    }


}
