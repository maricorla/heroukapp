package tests;

import org.testng.annotations.Test;

public class NavigationTest extends BaseTest{
    @Test
    public  void testNavigator(){
        homepage.clickDynamicLoading().clickDynamicLoadingExample2();
        //there isn't driver after these 2 methods because it returns void
        //so in WindowManager you should add method getWindowManager
        // and give the driver in the method
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goTo("https://www.tut.by/");

    }

    @Test
    public void testSwitchTab(){
        homepage.clickmultipleWindowsPage().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
