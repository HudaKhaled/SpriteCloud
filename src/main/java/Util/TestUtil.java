package Util;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil extends TestBase {

   public static long PAGE_LOAD_TIMEOUT = 30;
   public static long IMPLICIT_WAIT = 20;

   public static Actions actions;
   public static WebDriverWait wait;

   public static String validatePageTitle() {
      return driver.getTitle();
   }

   public static void MoveToElement(WebElement webElement) {
      actions = new Actions(driver);
      actions.moveToElement(webElement).perform();
   }

   public static void ClickOnAnElement(WebElement webElement) {
      actions = new Actions(driver);
      actions.click(webElement).perform();
   }

   public static void WaitUntilElementVisible(WebElement webElement) {
     wait=new WebDriverWait(driver, 20);
     wait.until(ExpectedConditions.visibilityOf(webElement));


   }
   //add common mhghiethods heereeeeeee



}
