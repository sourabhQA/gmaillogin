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
		
		
	//Opening firefox 
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Adding the implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Opening the website
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//Adding the email
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("saurabh@grappus.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc' and @xpath=\"1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("grappus123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		//Tap on compose button
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3' and @role=\"button\"]")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//div[@class='wO nr l1']//div[@class='aA6']//preceding-sibling::textarea[@rows=1]")).sendKeys("saurabh2323@grappus.com");
		driver.findElement(By.xpath("//input[@name=\"subjectbox\"]")).sendKeys("test");

		Thread.sleep(2000);
		//Tap on three dot icon
		driver.findElement(By.cssSelector("body.aAU:nth-child(2) div.dw:nth-child(37) div.nH div.nH div.no div.nH.nn:nth-child(3) div.no div.nH.nn:nth-child(1) div.AD div.nH div.nH.Hd div.nH:nth-child(3) div.aaZ div.M9 div.aoI:nth-child(4) table.aoP.aoC:nth-child(2) td.I5 table.iN:nth-child(4) td.HE div.aDg div.aDj.aDn div.aDh table.IZ tr.btC td.gU.az5:nth-child(5) div.J-J5-Ji.btx div.J-J5-Ji.bty:nth-child(1) div.J-JN-M-I.J-J5-Ji.Xv.L3.T-I-ax7.T-I > div.J-J5-Ji.J-JN-M-I-JG:nth-child(2)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[21]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[6]/div[1]/div[3]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Create new')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[34]/div[2]/input[1]")).sendKeys("SeleniumTest");
		driver.findElement(By.xpath("/html[1]/body[1]/div[33]/div[3]/button[1]")).click();
		
		
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
		
	
		
	}
	
	
	
	
	

}
