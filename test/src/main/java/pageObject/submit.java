package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.Testbase;



public class submit extends Testbase{
	
	

	@FindBy(css = "button[data-hook='actions.go']")
 	public WebElement go;

	@FindBy(css = "button[data-notify-action='Submit']")
 	public WebElement go1;
	
	@FindBy(css = "button[data-hook='actions.select']")
 	public WebElement submit1;
	
	@FindBy(css = "button[data-hook='actions.go']")
 	public WebElement go2;
	
	@FindBy(css = "button[data-hook='actionperform.do']")
 	public WebElement go3;
	
	@FindBy(css = "button[data-action='Accept']")
	public WebElement Accept;
	
	public submit()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submit1() throws Exception
	{
		go1.click();
		Thread.sleep(10000);
		go3.click();
	}
	
	public void submit2() throws InterruptedException
	{
		Thread.sleep(5000);
		submit1.click();
		Thread.sleep(5000);
		Accept.click();
		Thread.sleep(5000);	
		go3.click();
	}
	
	
}

