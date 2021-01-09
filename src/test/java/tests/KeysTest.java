package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.*;

public class KeysTest extends BaseTest{
    @Test
    public void checkSendKeys(){
        var keyPage =homepage.clickKeyPressesPage();
        keyPage.insertKeys("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPage.getResult(), "You entered: BACK_SPACE", "Not equals");
    }

    @Test
    public void checkSliderActions(){
        int numOfSteps = 8;

        var horizPage= homepage.clickHorizontalSliderPage();
        float stepSize=Float.parseFloat(horizPage.getStep());
        horizPage.moveSliderRight(numOfSteps);
        String result = horizPage.getResultValueRange();

        Assert.assertEquals(result, ""+(int)(numOfSteps*stepSize), "Wrong number");
    }

    @Test
    public void checkWorkDynamicPage(){

        var dynamicPage=homepage.clickDynamicLoading();
        var dynamicLoadExample2Page= dynamicPage.clickDynamicLoadingExample2();
        dynamicLoadExample2Page.clickStartButton();
        String result = dynamicLoadExample2Page.resultOfLoad();

        Assert.assertFalse(dynamicLoadExample2Page.isStartButtonDisplayed(), "There is button");
       Assert.assertEquals(result, "Hello World!");

    }



}
