

	package testCases;

	import java.io.IOException;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import pageObject.createQuote;
	import pageObject.customerCapture;
	import pageObject.loginPage;
	import pageObject.submit;
	import pageObject.updateScreen;
	import testBase.Testbase;

	public class e2E extends Testbase{
		loginPage LoginPage ;
		customerCapture CC;
			
		public e2E()
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
			 createQuote CQ = new createQuote();
				CQ.quote1();
				CQ.newquote1();
				Thread.sleep(10000);
				//CQ.assetselection1();
			//	Thread.sleep(10000);
				CQ.manufacture1("AUDI");
				//CQ.select();
			CQ.enter();
		CQ.button2();
		Thread.sleep(2000);
				CQ.quan("20000");
				CQ.done();
				Thread.sleep(10000);
				CQ.finance1();
				CQ.search1();
				CQ.productSelect();
				Thread.sleep(10000);
				CQ.save1();		
				submit SB = new submit();
				Thread.sleep(10000);
				SB.submit1();
				Thread.sleep(10000);
				SB.submit2();
				Thread.sleep(10000);
				updateScreen US = new updateScreen();
				 US.update1();
			     US.paymentdate1();
			     US.accountHolderName("testing");
			     US.bankName("ploki");
			     US.accountNumber("123456");
			     US.bankSortCode("789456");
			     US.zipPostal("7894");
			     US.streetNumber("85");
			     US.streetName("plok");
			     US.city("plokk");
			     US.county("oikuj");
			     US.timeAtBankYears("8");
			     US.timeAtBankMonths("7");
			     US.registrationDate("23/08/2018");
			     US.registrationNumber("8596323");
			     US.odometer("8");
			     US.vin("28945612345698444");
			     US.orderNumber("1234567859");
			     US.serialNumber("12356");
			     US.Save();
			     Thread.sleep(10000);
			     US.SummaryPage();
			}
	
			
		
		
		@AfterMethod
		public void tearDown()
		{
		driver.quit();
		}
		
	}


