package Tests;

import Base.TestBase;
import Pages.HomePage;
import Util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomeTest extends TestBase {

    HomePage homePage;

    public HomeTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
    }

    @Test
    public void validatePageTitle() {
        String pageTitle = TestUtil.validatePageTitle();
        Assert.assertEquals(pageTitle, "UI Test Automation Playground");
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
