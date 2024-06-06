package Basepckg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Baseclass {
		public static WebDriver driver;
			
			@BeforeTest
			public void setup() {
				driver=new ChromeDriver();
				driver.get("https://www2.hm.com/en_in/index.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				
			}
			@AfterTest
			public void postcondition() {
				driver.quit();
			
		}


}
