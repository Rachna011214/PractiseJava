package basicWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoWindowAlert {
	WebDriver driver;



	  public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Rachna\\Programs\\GraphQLAPIAutomation-master\\GraphQLAPIAutomation-master\\Prac01\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		//input[@name='password']

		// enter a valid email address
		driver.findElement(By.name("identifier")).sendKeys("racautomations@gmail.com");
		
		driver.findElement(By.id("identifierNext")).click();
		
		Thread.sleep(4000);
		

		// enter a valid password
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Automation@123");

		// click on sign in button
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(30000);

		// click on compose button
		driver.findElement(By.xpath("//div[@class='z0']//div[contains(text(),'COMPOSE')]")).click();

		// click on attach files icon
		driver.findElement(By.xpath("//div[contains(@command,'Files')]//div[contains(@class,'aaA')]")).click();

		// creating instance of Robot class (A java based utility)
		Robot rb = new Robot();

		// pressing keys with the help of keyPress and keyRelease events
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SHIFT);

		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_P);
		rb.keyRelease(KeyEvent.VK_P);

		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);

		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	

	
		driver.quit();
	}
}
