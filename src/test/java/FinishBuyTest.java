// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FinishBuyTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void finishBuy() {
    driver.get("https://www.saucedemo.com/inventory.html");
    driver.manage().window().setSize(new Dimension(1352, 1408));
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
    driver.findElement(By.cssSelector(".shopping_cart_badge")).click();
    driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).sendKeys("David");
    driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).sendKeys("Fernandez");
    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).sendKeys("28290");
    driver.findElement(By.cssSelector("*[data-test=\"continue\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"back-to-products\"]")).click();
    driver.findElement(By.cssSelector(".shopping_cart_link")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".inventory_item_name"));
      assert(elements.size() == 0);
    }
  }
}
