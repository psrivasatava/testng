package pageObject ;

import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
 
import org.openqa.selenium.support.PageFactory;

import testBase.Testbase;



public class loginPage extends Testbase{
	
	
		 
	@FindBy(css = "input[data-hook='login.username']")
 	public WebElement UserName;
 
	@FindBy(css = "input[data-hook='login.password']")
 	public WebElement Password;
 
	@FindBy(css = "BUTTON[data-hook='login.submit']")
 	public WebElement btn_Login ;
	
	public loginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
 
    public customerCapture Login(String un, String pw)
    {
    	UserName.sendKeys(un);
    	Password.sendKeys(pw);
    	btn_Login.click();
    	return  new customerCapture();
    }

    }
