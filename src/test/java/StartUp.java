import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class StartUp {

    private WebDriver driver;
    private static final String MOBI_ADDRESS="https://www.mobile.bg";
    private static final String PATH_DRIVER =
            "C:\\Users\\Nukem\\Desktop\\selenium_Java\\chromedriver.exe";
    private MobilePage mobilePage;
    private registrationBMW bmw;

    @Before
    public void TestInit(){
     System.setProperty("webdriver.chrome.driver",PATH_DRIVER);
     driver = new ChromeDriver();
     mobilePage = new MobilePage((ChromeDriver) driver);
     bmw = bmwFactory.carInfo();
    }


    @Test
    public void TestNavigate(){
        PageFactory.initElements(this.driver,mobilePage);
        mobilePage.Navigate();
        mobilePage.FillForm(bmw);
        String address = driver.getCurrentUrl();
        String[] wwws = address.split("www.");
        Assert.assertTrue(wwws[1].startsWith("mobile"));

    }


}
