package Base;

import Util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
//
//         // use Properties class to scan file with .properties extension
//          prop = new Properties();
//         //we read file //fileInputStream takes file path>> properties file
//         FileInputStream fis = new FileInputStream("src/main/java/Config/Config.properties");
//         //load the file so prop object knows the file
//         prop.load(fis);
//         //getProperty is to get the key
//        // return prop.getProperty(Key);

        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/main/java/Config/Config.properties");
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void initialization() {
        String browser = prop.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }
}
