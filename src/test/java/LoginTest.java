/*
*Author - Sergey Belavsky
*/
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;


public class LoginTest {
    WebDriver driver = new FirefoxDriver();

    @Before
    public void setUp() {
        driver.get("https://webmail.itransition.com");
    }

    @Test
    public void loginTest() {
        //Выбор радиобаттона по xpath
        WebElement radio = driver.findElement(By.xpath("//input[@value=\"4\"]"));
        radio.click();
        //Выбор чекбокса по CSS
        WebElement check = driver.findElement(By.cssSelector("input#chkBsc.rdo"));
        check.click();
        //Выбор текстбоксов по классу
        List<WebElement> textboxes = driver.findElements(By.className("txt"));
        for (WebElement WE : textboxes) {
            WE.sendKeys("password");
        }
        //Выбор кнопки входа по ID
        WebElement button = driver.findElement(By.id("SubmitCreds"));
        button.click();
    }

    @After
    public void tearDown() {
        //driver.quit();
    }
}
