package Tests;

import Base.TestBase;
import Pages.HomePage;
import Pages.SampleAppLoginPage;
import Util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SampleAppLoginTest extends TestBase {

    SampleAppLoginPage sampleAppLoginPage;
    HomePage homePage;

    public SampleAppLoginTest() {
        //super to call constructor of parent class
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        sampleAppLoginPage = new SampleAppLoginPage();
        homePage.clickSampleApp();
    }

    @Test
    public void sampleAppLoginTitleTest() {
        String pageTitle = TestUtil.validatePageTitle();
        Assert.assertEquals(pageTitle, "Sample App");
    }

    @Test
    public void login() {
        sampleAppLoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        Assert.assertEquals(sampleAppLoginPage.checkLoginStatus(), "Welcome, " + prop.getProperty("username") + "!");
    }

    @Test
    public void logout() {
        sampleAppLoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        sampleAppLoginPage.logOut();
        Assert.assertEquals(sampleAppLoginPage.checkLoginStatus(), "User logged out.");
    }

    @Test
    public void loginWithOutCredentials() {

        sampleAppLoginPage.clickLogin();
        Assert.assertEquals(sampleAppLoginPage.checkLoginStatus(), "Invalid username/password");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
