package tugas4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWebTest {
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	// webdriver untuk wait juga menggunakan multithread
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		driver.set(new ChromeDriver());
		explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(60)));
		driver.get().get("https://yopmail.com/en/");
	}
	
	@AfterMethod
	public void cleanUp() {
		driver.get().quit();
	}
}