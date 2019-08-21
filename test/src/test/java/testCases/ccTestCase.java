package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.customerCapture;
import pageObject.loginPage;
import testBase.Testbase;

public class ccTestCase extends Testbase{
	loginPage LoginPage ;
	customerCapture CC;
		
	public ccTestCase()
	{
		super();
	}

	
	@BeforeMethod
	   public void setup()
	{
		testBase.Testbase.initialization();
		LoginPage = new loginPage();
		CC =	LoginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void customercapture() throws Exception
	{
				
		CC.newProposal();
		CC.dpaAgreement();
		CC.customerType();
		CC.buttn();
		CC.title();
		CC.firstName("First");
		CC.lastName("Last name");
		CC.dateOfBirth("30/08/2000");
		CC.gender();
		CC.maritalStatus();
		CC.residentialStatus();
		CC.email("test@gmail.com");
	//	CC.phonestype0();
		CC.phones0("89656565656");
	//	CC.phonestype1();
		CC.phones1("896565656265");
		CC.contest1();
		CC.contest2();
		CC.contest3();
		CC.currentAddressstreetNumber("74");
		CC.currentAddresszipPostal("6789");
		CC.currentAddressstreetName("ikujik");
	    CC.currentAddresstimeAtAddressYears("7");
		CC.currentAddresstimeAtAddressMonths("6");
		CC.invoiceAddressstreetName("Invoice");
		CC.invoiceAddressstreetNumber("9");
		CC.invoiceAddresszipPostal("8596");
		CC.mailingAddressstreetName("mailing");
		CC.mailingAddressstreetNumber("9");
		CC.mailingAddresszipPostal("7896");
		CC.employmentType();
		Thread.sleep(8000);
		CC.employmentStatus();
		Thread.sleep(8000);
		CC.occupation();
		CC.jobTitle("ploiko");
		CC.employer("ujikil");
		CC.start("7");
		CC.end("2");
		CC.employersAddressstreetName("9878");
		CC.employersAddresszipPostal("7878");
		CC.employersAddressstreetNumber("8526");
		// CC.captureScreenshot(driver, "Pr.");
		 CC.SaveButton();
		 Thread.sleep(10000);
					    
		}


	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	
}
