package Tests;

import Base.TestBase;
import Pages.HomePage;
import Pages.OverLappedElementPage;
import Util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OverLappedElementTest extends TestBase {

    OverLappedElementPage overLappedElementPage;
    HomePage homePage;

    public OverLappedElementTest() {
        //super to call constructor of parent class
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        overLappedElementPage = new OverLappedElementPage();
        homePage.openOverLappedElementTest();
    }

    @Test
    public void checkPageTitle() {
        String pageTitle = TestUtil.validatePageTitle();
        Assert.assertEquals(pageTitle, "Overlapped Element");
    }

    //Note: This can also be done using java script executor
    @Test
    public void ScrollToElementAndEnterText() {
        String text = "text after scroll down";
        overLappedElementPage.scrollDownToTextBox();
        overLappedElementPage.EnterTextInNameTxtBox(text);
        String textInNameTxtBox = overLappedElementPage.GetTextTypedInTextBox();
        Assert.assertEquals(textInNameTxtBox, text);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}