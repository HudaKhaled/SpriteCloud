package Tests;

import Base.TestBase;
import Pages.ClickPage;
import Pages.HomePage;
import Util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ClickTest extends TestBase {

    ClickPage clickPage;
    HomePage homePage;

    public ClickTest() {
        //super to call constructor of parent class
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        clickPage = new ClickPage();
        homePage.openClickTest();
    }

    @Test
    public void clickTitleTest() {
        String pageTitle =  TestUtil.validatePageTitle();
        Assert.assertEquals(pageTitle, "Click");
    }

    @Test
    public void clickBadBtn() {
        clickPage.clickBadBtn();
        boolean isGreen = clickPage.checkThatBtnTurnsGreen();
        Assert.assertTrue(isGreen);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
