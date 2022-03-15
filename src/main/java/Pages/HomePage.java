package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    @FindBy(css = "a[href=\"/sampleapp\"]")
    WebElement sampleAppLink;

    @FindBy(css = "a[href=\"/click\"]")
    WebElement clickLink;

    @FindBy(css = "a[href=\"/ajax\"]")
    WebElement ajaxDataLink;

    @FindBy(css = "a[href=\"/textinput\"]")
    WebElement textInputLink;

    @FindBy(css = "a[href=\"/overlapped\"]")
    WebElement OverLappedElementLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public void clickSampleApp()  {
        sampleAppLink.click();
        new SampleAppLoginPage();
    }

    public void openClickTest() {
        clickLink.click();
        new ClickPage();
    }

    public void openAjaxDataTest(){
        ajaxDataLink.click();
        new AJAXDataPage();
    }

    public void openTextInputTest()  {
        textInputLink.click();
        new TextInputPage();
    }

    public void openOverLappedElementTest(){
        OverLappedElementLink.click();
        new OverLappedElementPage();
    }
}
