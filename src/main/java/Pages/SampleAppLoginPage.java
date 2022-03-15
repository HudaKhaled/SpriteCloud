package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleAppLoginPage extends TestBase {


    @FindBy (name = "UserName")
    WebElement userNameTxtBox;

    @FindBy (name = "Password")
    WebElement passwordTxtBox;

    @FindBy( id = "loginstatus")
    WebElement loginStatusLbl;

    @FindBy( id = "login")
    WebElement loginBtn;

    @FindBy (xpath = "//button[text()=\"Log Out\"]")
    WebElement logOutBtn;

    @FindBy( xpath = "//div//h3[text()= \"Sample App\"]")
    WebElement sampleAppHeader;


    public SampleAppLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void login (String username, String password)
    {
        userNameTxtBox.sendKeys(username);
        passwordTxtBox.sendKeys(password);
        clickLogin();
    }

    public void clickLogin()
    {
        loginBtn.click();
    }

    public void logOut()
    {
        logOutBtn.click();
    }

    public boolean validateSampleAppHeader(){
        return sampleAppHeader.isDisplayed();
    }

    public String checkLoginStatus()
    {
      return loginStatusLbl.getText();
    }
}
