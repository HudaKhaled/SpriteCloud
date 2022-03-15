package Tests;

import Base.TestBase;
import Pages.AJAXDataPage;
import Pages.HomePage;
import Util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AJAXDataTest extends TestBase {

    AJAXDataPage ajaxDataPage;
    HomePage homePage;

    public AJAXDataTest() {
        //super to call constructor of parent class
        super();
    }

    @BeforeMethod
    public void setUp() throws Exception {
        initialization();
        homePage = new HomePage();
        ajaxDataPage = new AJAXDataPage();
        homePage.openAjaxDataTest();
    }

    @Test
    public void clickTitleTest() {
        String pageTitle = TestUtil.validatePageTitle();
        Assert.assertEquals(pageTitle, "AJAX Data");
    }

    @Test
    public void clickAndWaitForDataToLoad() {
        ajaxDataPage.clickAjaxBtn();
        ajaxDataPage.waitForDataVisibility();
        Assert.assertTrue(ajaxDataPage.validateDataIsDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
