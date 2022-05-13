package tugas4;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import tugas4.pages.HomePage;
import tugas4.pages.MailPage;


/**
 * Unit test for simple App.
 */

// App test setela perubahan
public class AppTest extends BaseWebTest {
	
	HomePage homePage = new HomePage(driver, explicitWait);
	MailPage mailPage = new MailPage(driver, explicitWait);
	
	@Test
	public void get_firstmsg() {
		String inbox = "automationtest";
			
		homePage.inputInbox(inbox);
		homePage.clickInboxBtn();
				
		mailPage.switchingIframe();
		String message = mailPage.getMsg();
		System.out.println(message);

	}
}