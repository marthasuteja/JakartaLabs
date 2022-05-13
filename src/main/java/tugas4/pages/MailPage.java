package tugas4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailPage extends BasePage {
	By switchIframe = By.id("ifmail");
	By mail = By.xpath("//div[@id='mail']");
	
	public MailPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	public void switchingIframe() {
		switchIframe(switchIframe);
	}

	public String getMsg() {
		return getText(mail);
	
	}
}

