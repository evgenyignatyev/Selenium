package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;



import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SearchPage {

    private static WebDriver driver;

    @FindBy(css = "input.gLFyf.gsfi")
    private WebElement searchInput;

    @FindBy(css = "#search .g")
    public List<WebElement> results;


    public SearchPage(WebDriver driver) {
        initElements(driver, this);
    }

    public void search(String text) {
        searchInput.sendKeys(text, Keys.ENTER);
    }


}