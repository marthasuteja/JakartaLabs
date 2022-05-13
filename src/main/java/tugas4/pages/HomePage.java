package tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	By inboxField= By.xpath("//input[@id='login']");
	By btnInbox= By.xpath("//i[@class='material-icons-outlined f36']");

	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}

	public void inputInbox(String inbox) {
		setText(inboxField, inbox);
	}
	public void clickInboxBtn() {
		clickAndWait(btnInbox);
	}
}
