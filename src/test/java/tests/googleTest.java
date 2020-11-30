package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import pages.DetailsPage;
import pages.SearchPage;



import static org.junit.jupiter.api.Assertions.*;

public class googleTest {

    private static WebDriver driver;
    private static SearchPage searchPage;
    private static DetailsPage detailsPage;


    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        detailsPage = new DetailsPage(driver);
    }

    @BeforeEach
    public void setup() {
        driver.get("http://google.com");
    }


    @Test
    @DisplayName("Тест 1")
    public void test1(){
        searchPage.search("calculator");
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
        assertEquals("(1 + 2) × 3 - 40 ÷ 5 =",driver.findElement(By.cssSelector("span[jsname='ubtiRe']")).getText());
        assertEquals("1",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }


    @Test
    @DisplayName("Тест 2")
    public void test2(){
        searchPage.search("calculator");
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
        assertEquals("6 ÷ 0 =",driver.findElement(By.cssSelector("span[jsname='ubtiRe']")).getText());
        assertEquals("Infinity",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }

    @Test
    @DisplayName("Тест 3")
    public void test3(){
        searchPage.search("calculator");
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[2]/td[2]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
        assertEquals("sin(",driver.findElement(By.cssSelector("span[jsname='ubtiRe']")).getText());
        assertEquals("Error",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }



    @AfterAll
    public static void teardown(){
        driver.quit();
    }
}
