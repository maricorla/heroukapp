package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload extends BaseTest {

    @Test
    public void uploadFile(){
        String absolutePath= "C:\\Users\\marix\\Desktop\\Example\\Example.txt";
        var uploadPage= homepage.clickFileUploadPage();
        uploadPage.uploadFile(absolutePath);

        Assert.assertEquals(uploadPage.getResultOfUpload(), "Example.txt","Wrong");

    }

    @Test
    public void verifyTextAlert(){
        var contextMenuPage = homepage.clickContextMenuPage();
        contextMenuPage.rightClickInTheBox();
        var textResult = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();

        Assert.assertEquals(textResult, "You selected a context menu");

    }

}
