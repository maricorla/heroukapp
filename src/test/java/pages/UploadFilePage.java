package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadFilePage extends BasePage {

    @FindBy(id = "file-upload")
    private WebElement fileUploaderButton;

    @FindBy(id = "file-submit")
    private WebElement submitButton;

    @FindBy(id = "uploaded-files")
    private WebElement resultOfUpload;

    public UploadFilePage(WebDriver driver) {
        super(driver);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public void uploadFile(String absolutePathOfFile){
        fileUploaderButton.sendKeys(absolutePathOfFile);
       clickSubmitButton();
    }

    public String getResultOfUpload(){
        return resultOfUpload.getText();
    }
}

