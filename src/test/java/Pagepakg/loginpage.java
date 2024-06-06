package Pagepakg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	 
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"__next\"]/header/nav/div[1]/ul/li[1]/div/button/svg")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"__next\"]/header/nav/div[1]/ul/li[1]/div/button")
	WebElement button;
	
	@FindBy(name="email")
	WebElement emailfield;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"portal\"]/div/div[1]/div[2]/div/div/form/button")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"__next\"]/header/nav/div[3]/div/div[1]/ul/li[7]/a")
	WebElement sale;
	
	@FindBy(xpath="/html/body/hm-header/div/header/nav/div[3]/div/div[1]/ul/li[1]/a")
	WebElement firstoption;
	
	@FindBy(xpath="//*[@id=\"834e0a04-c536-41bf-814a-947e68ac0341\"]/div/div/div/div/div/div[3]/div/article/div[1]/a/div/div/img")
	WebElement firstproduct;
	
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div[1]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/button")
	WebElement firstproductadd;
	
	@FindBy(xpath="//*[@id=\"2965a75e-7b3f-4e02-9a4e-ffa56f5d6635\"]/div/div/div/div/div/div[6]/div/article/div[1]/a/div/div/img")
	WebElement secondproduct;
	
	@FindBy(xpath="//*[@id=\"sizeButton-0\"]/label")
	WebElement secondproductsize;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div[1]/div[2]/div[1]/div[2]/div/div[1]/div[3]/div[1]/button/span")
	WebElement secondadd;
	
	@FindBy(xpath="//*[@id=\"delivery-information-wrapper\"]/hm-delivery-information/div/button")
	WebElement firstproductdelivery;
	
	@FindBy(xpath="//*[@id=\"nav-mini-cart\"]/span[1]")
	WebElement firstshoppingbag;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div[1]/button")
	WebElement continuecheckout;
	
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"lastName\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/aside/div[1]/div[3]/button")
	WebElement almostdone;
	
	public loginpage(WebDriver driver)
		
		{
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
		}
			
		public void login()
		{
			Actions act=new Actions(driver);
			act.moveToElement(signin);
		}
        
	    public void loginbutton()
	    {
	    	button.click();
	    }
	    public void valuepass(String eml,String pswd)
		{
			
			emailfield.sendKeys(eml);
			password.sendKeys(pswd);
			
			}
		public void loginclick()
		{
			submit.click();
		}
		public void saleclick() throws InterruptedException
		{
			sale.click();
			firstoption.click();
		firstproduct.click();
			
			Thread.sleep(2000);

		}
		public void secondpdtclick()
		{
			secondproduct.click();
			secondproductsize.click();
			secondadd.click();
		}
		public void firstproductdeliveryclick() throws InterruptedException
		{
			firstproductdelivery.click();
			Thread.sleep(3000);
		}
		public void firstshoppingbagclick()
		{
			continuecheckout.click();
		}
		public void personel()
		{
			firstname.sendKeys("abcdefgh");
			lastname.sendKeys("manjooran ");
			
		}
		public void done()
		{
			almostdone.click();
		}
		public void back()
		{
			driver.navigate().to("https://www2.hm.com/en_in/sale.html");
		}
		
	}



     