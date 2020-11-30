package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class DetailsPage {

    @FindBy(css = "#wp-tabs-conteiner div[data-attrid*='poslednyaya_veriya'] .LrzXr.kno-fv")
    private WebElement lastVersion;

    @FindBy(css = "#wp-tabs-conteiner div[data-attrid*='licenziya'] .LrzXr.kno-fv")
    private WebElement license;

    @FindBy(css = "#wp-tabs-conteiner h2[data-attrid*='title']")
    private WebElement name;

    @FindBy(xpath = "//*[@id=\"cwos\"]")
    private WebElement otvet1;

    @FindBy(css = "span[jsname='VssY5c']")
    private WebElement virazhenie1;


    public DetailsPage(WebDriver driver) {
        initElements(driver, this);
    }

    public String getOtvet1() {
        return otvet1.getText();
    }
    public String getVirazhenie1() {
        return virazhenie1.getText();
    }
    public String getName() {
        return name.getText();
    }


    public String getLastVersion() {
        return lastVersion.getText();
    }

    public String getLicense() {
        return license.getText();
    }




}
