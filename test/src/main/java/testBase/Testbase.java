package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testbase {
	public static 	WebDriver driver;
	//public static ChromeDriver driver;
	 
	public static Properties prop;
	
	public Testbase()
	{
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\psrivastava\\Documents\\Selenium\\test\\src\\main\\java\\config\\config.properties");
			prop.load(fis);
		}
		catch (IOException e) {
			e.getMessage();
		}
	}

	public static void initialization()
	{
	String browserName = prop.getProperty("Browser");
	if(browserName.equals("chrome"))
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\psrivastava\\Documents\\Selenium\\test\\chromedriver.exe");
			driver = new ChromeDriver();
	     
			 driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(80,TimeUnit.SECONDS) ;
			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS) ;
			
	}
	
	 public static void clickon(WebDriver driver,WebElement Locator, int timeout)
		{
			new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(Locator));
			Locator.click();
		}


	 public static void captureScreenshot(WebDriver driver , String screenshotname) throws IOException
		{
			try
			{
				
			    TakesScreenshot ts = (TakesScreenshot)driver;
				File source=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source,new File ("C:\\Users\\psrivastava\\Documents\\Selenium\\test" +screenshotname+ ".png"));
			}
		catch(WebDriverException e)
			{
			System.out.println("Exception while taking screenshot");
			}
		}
   




}

