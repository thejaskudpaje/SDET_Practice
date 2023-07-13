package Com.Practice.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginToSupplyChainTest {
	static {
		WebDriverManager.chromedriver().setup();
		
	}
	WebDriver driver=new ChromeDriver();

//@Parameters("BROWSER")
@Test
public void openFacebookTest() {
	
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	
}
@Test
public void openInstagramTest() {
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/login/");
	
}
@Test
public void openFlipkartTest() {
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/login/");
	driver.close();
}
}
