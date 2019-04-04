package GmailTesting.Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmaillogin {
	static WebDriver driver;
	
	@Test
	public static void runGmailTest() throws Exception {
		
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("saurabh@grappus.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc' and @xpath=\"1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("grappus123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3' and @role=\"button\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@id=':tn' and @rows ='1']")).sendKeys("saurabh@grappus.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=':tg']")).sendKeys("Automated Test");
		driver.findElement(By.xpath("//div[@id=':sv' and  @style]")).click();
		
		
		
	}//div[@class='T-I J-J5-Ji T-I-KE L3' and @role="button"]
	
	
	
	
	

}
