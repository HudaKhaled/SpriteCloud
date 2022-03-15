package Pages;

import Base.TestBase;
import Util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickPage extends TestBase {

    @FindBy(id = "badButton")
    public WebElement btnThatIgnoresClick;


    public ClickPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickBadBtn()
    {
        TestUtil.ClickOnAnElement(btnThatIgnoresClick);
    }

    public boolean checkThatBtnTurnsGreen()
    {
       return btnThatIgnoresClick.getAttribute("class").contains("success");
    }
}

