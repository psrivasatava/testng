package pageObject;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;
import testBase.Testbase;


public class createQuote extends Testbase {
	
	@FindBy(css = "button[data-hook='progressionsteps.item.button']")
 	public WebElement quote;

	@FindBy(css = "button[data-hook='quoting.asset.chooseanasset']")
 	public WebElement newquote;
	
	
	
	
	@FindBy(css = "input[name='search']")
 	public WebElement manufacturer;
	
	@FindBy(css = "mat-nav-list[class='asset-search-results mat-nav-list mat-list-base']")
	public WebElement button;

	@FindBy(css = "mat-nav-list[data-hook = 'asset.search.results']")
 	public WebElement assetselection;
	
	/*@FindBy(css = "select[data-hook='assetselection.newform.model']")
 	public WebElement model;
	
	@FindBy(css = "select[data-hook='assetselection.newform.variant']")
 	public WebElement variant;*/
	
	@FindBy(css = "button[data-hook='asset.search.use.button']")
 	public WebElement button1;
	
	@FindBy(css = "input[formcontrolname='salePrice']")
 	public WebElement quantity;
	
	@FindBy(css = "button[data-hook='asset.search.details.done.button']")
 	public WebElement done;
	
	@FindBy(css = "button[data-hook='quoting.finance.product-select']")
 	public WebElement finance;
	
	@FindBy(css = "input[data-hook='search-results.search']")
 	public WebElement search;
	
	@FindBy(css = "button[data-hook='product-selection.use']")
 	public WebElement productSelect;
	
	@FindBy(css = "button[data-hook='save']")
 	public WebElement save;
	

	public createQuote()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void quote1()
	{
		quote.click();
	}
	
	public void newquote1()
	{
		newquote.click();
	}
	
/*	public void assetselection1()
	{
		assetselection.click();
	}*/
	
public void manufacture1(String Maun)

	{
		
		manufacturer.sendKeys(Maun);
	}
/*public void select()
	{
		Select assetselection1 = new Select(assetselection);
		assetselection1.selectByVisibleText("AUDI A1 SPORTBACK 25 TFSI S Line 5dr (2018-)");

		}*/

	public void enter()
	{
		List<WebElement> list = driver.findElements(By.cssSelector("div[class='mat-list-text']"));
		//System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("AUDI A1 SPORTBACK 25 TFSI S Line 5dr (2018-)"))
			{
				list.get(i).click();
				break;
			}
		}
		button.click();
	}
	
	/* public void model1()

	{
		Select model1 = new Select(model);
		model1.selectByVisibleText("A1 DIESEL HATCHBACK");
	}
	
	public void variant1()

	{
		Select variant1 = new Select(variant);
		variant1.selectByVisibleText("1.6 TDI SE 3dr (2015-)");
	}*/
	
	public void button2()
	{
		button1.click();
	}
	
	public void quan(String qanti)
	{
		quantity.sendKeys(qanti);
	}
	
	public void done()
	{
		done.click();
	}
	public void finance1()
	{
		finance.click();
	}
	
	public void search1()

	{
		List<WebElement> list = driver.findElements(By.xpath("//a[@data-hook='search-results.anchor']//div/descendant::h3[@class='ng-binding']"));
		//System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Gold Lease purchase"))
			{
				list.get(i).click();
				break;
			}
		}
		search.click();
	}
	
	public void productSelect()
	{
		productSelect.click();
	}
	
	public submit save1()
	{
		
		//take the screenshot of the entire home page and save it to a png file
		Screenshot Quote = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
		try {
			ImageIO.write(Quote.getImage(), "PNG", new File("C:\\Users\\psrivastava\\Documents\\Selenium\\cucumber\\Screenshot\\Quote.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		save.click();
		return new submit();
		
	}
	
}
