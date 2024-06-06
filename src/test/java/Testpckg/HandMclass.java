package Testpckg;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Basepckg.Baseclass;
import Pagepakg.loginpage;
import utilities.Excelutilities;

public class HandMclass extends Baseclass{
 @Test(priority=1)
	public void signin() throws Exception {
		
		loginpage ob =new loginpage(driver);
		
		{
			ob.login();
		}
		Thread.sleep(3000);
		
	}
 
 @Test
 public void signclick()
 {
	 loginpage ob =new loginpage(driver);
			 ob.loginbutton();
 }
 {
	 
 }
 
 @Test(priority=2)
	public void signinbutton() throws Exception
	
	{
		loginpage ob=new loginpage(driver);
		String Excel = "C:\\Users\\dilsh\\OneDrive\\Desktop\\HandM\\HandM.xlsx";

        String Sheet = "Sheet1";

        int rowcount = Excelutilities.getrowcount(Excel, Sheet);
        
        for (int i=1;i<=rowcount;i++)

        {
                    String Username=Excelutilities.getcellvalue(Excel, Sheet, i, 0);
                    System.out.println("username---"+Username);
                    String Password=Excelutilities.getcellvalue(Excel, Sheet, i, 1);
                    System.out.println("password---"+Password);
                    
                  
                   ob.valuepass(Username, Password);
                   
            	 Thread.sleep(3000);

                 ob.loginclick();
        }
                                
        }
        @Test(priority=2)
        public void pdctclick() throws InterruptedException
        {
        	loginpage ob = new loginpage(driver);
        	ob.saleclick();
        	Thread.sleep(3000);
        	//driver.navigate().to("https://www2.hm.com/en_in/index.html");     //back to sale page
        	
        }
        @Test(priority=3)
        public void secondpdtclick() throws InterruptedException
        {
        	loginpage ob = new loginpage(driver);
        	ob.secondpdtclick();
        	
        	Thread.sleep(3000);
        }

       @Test(priority=4)
        public void checkoutclickk() throws InterruptedException
        {
        	loginpage ob = new loginpage(driver);
        	ob.firstshoppingbagclick();
        	ob.personel();
        	Thread.sleep(3000);
        	
        	
        }
        @Test(priority=5)
        public void backtohome()
        {
        	loginpage ob = new loginpage(driver);
        	ob.back();
        }	 
		 
	}
	
	

