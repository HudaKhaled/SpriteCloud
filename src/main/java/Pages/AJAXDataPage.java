package Pages;

import Base.TestBase;
import Util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AJAXDataPage extends TestBase {

    @FindBy(id = "ajaxButton")
    WebElement ajaxBtn;

    @FindBy(xpath = "//p[text()=\"Data loaded with AJAX get request.\"]")
    WebElement dataLoaded;

    public AJAXDataPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickAjaxBtn() {
        ajaxBtn.click();
    }

    public void waitForDataVisibility() {
        TestUtil.WaitUntilElementVisible(dataLoaded);
    }

    public boolean validateDataIsDisplayed() {
        return dataLoaded.isDisplayed();
    }

}

