package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextInputPage extends TestBase {


    @FindBy(id = "newButtonName")
    WebElement myButtonTxtBox;

    @FindBy(id = "updatingButton")
    WebElement updatingButtonBtn;

    public TextInputPage() {
        PageFactory.initElements(driver, this);
    }

    public TextInputPage EnterTextToButtonTxtBox(String newButtonName) {
        myButtonTxtBox.sendKeys(newButtonName);
        return this;
    }

    public TextInputPage ClickToChangeBtnName() {
        updatingButtonBtn.click();
        return this;
    }

    public String GetTextOnButton() {
        return updatingButtonBtn.getText();
    }
}

