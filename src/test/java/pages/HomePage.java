package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(linkText = "Dropdown")
    private WebElement dropdown;

    @FindBy(linkText = "Hovers")
    private WebElement hovers;

    @FindBy(linkText = "Key Presses")
    private WebElement keyPressesLink;

    @FindBy(linkText = "Horizontal Slider")
    private WebElement horizonalSlider;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public DropdownPage clickDropdownPage(){
        dropdown.click();
        return new DropdownPage(driver);
    }

    public HoversPage clickHoversPage(){
        hovers.click();
        return new HoversPage(driver);
    }

    public KeyPage clickKeyPressesPage(){
        keyPressesLink.click();
        return new KeyPage(driver);

    }

    public HorizontalSliderPage clickHorizontalSliderPage(){
        horizonalSlider.click();
        return new HorizontalSliderPage(driver);}

}
