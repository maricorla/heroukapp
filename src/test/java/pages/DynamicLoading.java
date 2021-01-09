package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicLoading extends BasePage {

    public String xpathLink(String text){
        return "//a[contains(text()," + text + ")]";
    }

    private By link_Example2= By.xpath(xpathLink("'Example 2'"));

    public DynamicLoadingExample2Page clickDynamicLoadingExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }



    public DynamicLoading(WebDriver driver) {
        super(driver);
    }


}
