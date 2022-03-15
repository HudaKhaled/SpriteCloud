package Tests;

import Base.TestBase;
import Pages.HomePage;
import Pages.TextInputPage;
import Util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TextInputTest extends TestBase {

    TextInputPage textInputPage;
    HomePage homePage;

    public TextInputTest() {
        //super to call constructor of parent class
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        textInputPage = new TextInputPage();
        homePage.openTextInputTest();
    }

    @Test
    public void clickTitleTest() {
        String pageTitle = TestUtil.validatePageTitle();
        Assert.assertEquals(pageTitle, "Text Input");
    }

    @Test
    public void CheckButtonText() {
        String textEntered = "New Button";
        String textAfterUpdating = textInputPage.EnterTextToButtonTxtBox(textEntered)
                .ClickToChangeBtnName()
                .GetTextOnButton();

        Assert.assertEquals(textAfterUpdating, textEntered);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}