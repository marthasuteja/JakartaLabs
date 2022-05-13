package tugas3;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import tugas3.pages.LoginPageFactory;
import tugas3.pages.ProfilePageFactory;

/**
 * Unit test for simple App.
 */

// App test setela perubahan
public class AppTestAfterPageFactory extends BaseWebTest	{
		
		@Test
		public void berhasilLogin() {
			LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
			ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
			
			String username = "tomsmith";
			String password = "SuperSecretPassword!";
			
			loginPage.inputUsername(username);
			loginPage.inputPassword(password);	
			loginPage.clickLoginButton();
			String actualText = profilePage.getProfileText();
			
			System.out.println(actualText);
			
    		String expectedText = "You logged into a secure area!";
    		Assert.assertTrue(actualText.contains(expectedText));
    	}
		
		@Test
    	public void salahPassword() {
			LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
			ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
			
			String username = "tomsmith";
			String password = "salah password";
			
    		
			loginPage.inputUsername(username);
			loginPage.inputPassword(password);	
			loginPage.clickLoginButton();  		
    		String actualText = profilePage.getProfileText();
    		
    		String expectedText = "Your password is invalid!";
    		Assert.assertTrue(actualText.contains(expectedText));
    	}
		
		@Test
    	public void tidakLogin() {
			LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
						
			String username = "tomsmith";
			String password = "SuperSecretPassword";
			
			loginPage.inputUsername(username);
			loginPage.inputPassword(password);
			String actualText = loginPage.getBannerText();
			
			String expectedText = "Login Page";
			Assert.assertTrue(actualText.contains(expectedText));
    	}
		
		@Test
    	public void salahUsername() {
			LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
			ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
			
			String username = "salah username";
			String password = "SuperSecretPassword!";
			
    		
			loginPage.inputUsername(username);
			loginPage.inputPassword(password);	
			loginPage.clickLoginButton();  		
    		String actualText = profilePage.getProfileText();
    		
    		String expectedText = "Your username is invalid!";
    		Assert.assertTrue(actualText.contains(expectedText));
    	}

				
 	}


