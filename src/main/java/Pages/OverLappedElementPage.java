package Pages;

import Base.TestBase;
import Util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverLappedElementPage extends TestBase {


    @FindBy(id = "name")
    WebElement nameTxtBox;

    @FindBy(id = "subject")
    WebElement subjectTextBox;


    public OverLappedElementPage() {
        PageFactory.initElements(driver, this);
    }

    public void EnterTextInNameTxtBox(String name) {
        nameTxtBox.sendKeys(name);
    }

    public void scrollDownToTextBox() {
        TestUtil.MoveToElement(subjectTextBox);
    }

    public String GetTextTypedInTextBox() {
        return nameTxtBox.getAttribute("value");
    }
}