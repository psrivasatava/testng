package testCases;

import pageObject.customerCapture;
import pageObject.loginPage;
import testBase.Testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTestCase extends Testbase{
	loginPage LoginPage ;
	customerCapture CC;
	
	public loginTestCase()
	{
		super();
	}

	@BeforeMethod
	   public void setup()
	{
		testBase.Testbase.initialization();
		LoginPage = new loginPage();
		
		//CC =	LoginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	
	@Test
	public void login()
	{
		loginPage LoginPage = new loginPage();
		CC =	LoginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}