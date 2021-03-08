package general;


import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.io.File;
import java.io.IOException;


import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseTest implements IAutoConstant {
    public WebDriver driver;


    @BeforeTest
    public void setDriver() throws IOException {
        System.setProperty(CHROME_KEY, CHROME_VALUE);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = LibraryClass.getConfigProperties(CONFIG_PATH, "URL");
        System.out.println(url);
        driver.get(url);
    }


    @AfterTest
    public void tearDown() {

        driver.quit();
    }

    public void takeScreenshot() throws IOException {
        Date d = new Date();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("/Users/priyankakondur/Desktop/MyProjectsPOM/mavenProject/src/screenshots/" + d + "_screenshot.png");
        Files.copy(srcFile, destFile);
    }
}
