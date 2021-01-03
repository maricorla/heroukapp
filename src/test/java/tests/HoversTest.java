package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoversPage;

public class HoversTest extends BaseTest {

    @Test
    public void testnameOfFigure(){
        HoversPage hoverPage = homepage.clickHoversPage();
        HoversPage.FigureCaption caption = hoverPage.hoverOverFigure(0);
        Assert.assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user1", "There is wrong name");
        Assert.assertEquals(caption.getTextLink(),"View profile", "Wrong Link");
        Assert.assertTrue(caption.getLink().endsWith("/users/1"), "link incorrect");

    }




}

