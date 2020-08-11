import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobilePage {
    private ChromeDriver driver;
    private WebDriverWait wait;
    public MobilePage(ChromeDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,3);
    }
    public void Navigate(){
        driver.navigate().to("https://www.mobile.bg");
        wait.until(ExpectedConditions.elementToBeClickable(advancedSearch));
        advancedSearch.click();
    }

    @FindBy(how= How.XPATH, using = "//*[@id=\"blocksrc\"]/form/table/tbody/tr[7]/td[3]/a/strong")
    public WebElement advancedSearch;
    @FindBy(how=How.XPATH, using ="//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[2]/tbody/tr[3]/td[1]/select")
    public WebElement selectBrandBMW;
    @FindBy(how=How.XPATH,using = "//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[2]/tbody/tr[3]/td[3]/select")
    public WebElement selectModelBMW;
    @FindBy(how=How.XPATH,using = "//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[3]/tbody/tr[3]/td[5]/select")
    public WebElement startYear;
    @FindBy(how=How.XPATH,using = "//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[3]/tbody/tr[3]/td[7]/select")
    public WebElement endYear;
    @FindBy(how=How.XPATH,using = "//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[5]/tbody/tr[3]/td[1]/select")
    public WebElement typeEngine;
    @FindBy(how=How.XPATH,using = "//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[5]/tbody/tr[3]/td[3]/select")
    public WebElement typeGearBox;
    @FindBy(how=How.XPATH,using = "//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[4]/tbody/tr[3]/td[11]/select")
    public WebElement coupeType;
    @FindBy(how=How.XPATH, using = "//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[3]/tbody/tr[3]/td[9]/select")
    public WebElement sortingBy;
    @FindBy(how=How.XPATH, using = "//*[@id=\"mainholder\"]/form/table/tbody/tr/td/table[2]/tbody/tr[1]/td[7]/input")
    public WebElement searchButton;


    public void FillForm(registrationBMW bmw){
        Select selectBrand = new Select(selectBrandBMW);
        selectBrand.selectByVisibleText(bmw.getBrand().toUpperCase());
        Select selectModelBmw = new Select(selectModelBMW);
        selectModelBmw.selectByValue(bmw.getModel());
        Select selectStartYear = new Select(startYear);
        selectStartYear.selectByValue(bmw.getStartYear());
        Select selectEndYear = new Select(endYear);
        selectEndYear.selectByValue(bmw.getEndYear());
        Select selectTypeOfEngine = new Select(typeEngine);
        selectTypeOfEngine.selectByValue(bmw.getEngineType());
        Select selectTypeGearbox = new Select(typeGearBox);
        selectTypeGearbox.selectByValue(bmw.getGearboxType());
        Select selectCoupeType = new Select(coupeType);
        selectCoupeType.selectByValue(bmw.getCoupeType());
        Select selectSortingBy = new Select(sortingBy);
        selectSortingBy.selectByValue(bmw.getSortingType());
        searchButton.click();
    }
}
