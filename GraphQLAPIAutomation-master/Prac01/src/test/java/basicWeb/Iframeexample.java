package basicWeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframeexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Rachna\\Programs\\GraphQLAPIAutomation-master\\GraphQLAPIAutomation-master\\Prac01\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "https://demo.guru99.com/test/radio.html";

		driver.get(url);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("site-name")));
		List<WebElement> listofFrames = driver.findElements(By.tagName("iFrame"));
		System.out.println("Frame size is "+listofFrames.size());
		driver.switchTo().frame(0);
		
		
		driver.close();
	}

}
