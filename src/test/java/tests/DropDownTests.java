package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTest {

    @Test
    public void testSelectOption(){
        var dropdownPage = homepage.clickDropdownPage();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions=dropdownPage.getSelectedOptions();
        assertTrue(selectedOptions.contains(option),"I did");
       assertEquals(selectedOptions.size(),2, "Wrong numbers");


    }



}
