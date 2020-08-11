import jdk.jfr.Timespan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public WebDriver getDriver(){
        return this.driver;
    }
    public WebDriverWait getWait(){
        return this.wait;
    }
}